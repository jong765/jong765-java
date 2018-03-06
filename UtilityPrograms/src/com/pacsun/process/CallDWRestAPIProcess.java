package com.pacsun.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

import com.pacsun.util.StackTrace;

public class CallDWRestAPIProcess {

	private static final Logger log = Logger.getLogger(CallDWRestAPIProcess.class);

	public void run() throws Exception {

		try {

			String urlString = "http://dev06.web.pacsun.demandware.net/on/demandware.store/Sites-pacsun-Site/default/JK_Test-Job6";
			String orderNumber = "00002201";

			HttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(urlString);

			List<BasicNameValuePair> nameValuePairs = new ArrayList<BasicNameValuePair>(1);
			nameValuePairs.add(new BasicNameValuePair("orderNumber", orderNumber));
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			HttpResponse response = client.execute(post);

			int httpStatusCode = response.getStatusLine().getStatusCode();

			System.out.println("Http Status code: " + httpStatusCode);

			if (httpStatusCode == 200) {
				String xmlString = this.getResponseXml(response);

				SAXBuilder builder = new SAXBuilder();

				Document document = (Document) builder.build(new InputSource(new StringReader(
						xmlString)));

				Element rootNode = document.getRootElement();

				String brand = rootNode.getChild("brand").getValue().trim();
				String productName = rootNode.getChild("productName").getValue().trim();

				System.out.println("Product name is " + brand + " " + productName);
			} else {
				System.out.println("Http error occurred while calling DW rest api.");
			}
		} catch (Exception e) {
			log.error(StackTrace.getStackTrace(e));
			throw new Exception();
		}
	}

	public String getResponseXml(HttpResponse response) throws IOException {

		BufferedReader rd = null;
		StringBuilder stringBuilder = new StringBuilder();

		try {
			rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuilder.append(line);
			}
		} catch (IllegalStateException e) {
			throw new IllegalStateException();
		} catch (IOException e) {
			throw new IOException();
		} finally {
			if (rd != null)
				rd.close();
		}

		return stringBuilder.toString();

	}

}
