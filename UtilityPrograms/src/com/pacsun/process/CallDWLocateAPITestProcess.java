package com.pacsun.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

import com.pacsun.util.StackTrace;

public class CallDWLocateAPITestProcess {

	private static final Logger log = Logger.getLogger(CallDWLocateAPITestProcess.class);

	public void run() throws Exception {

		try {

			String urlString = "https://dev06.web.pacsun.demandware.net/on/demandware.store/Sites-pacsun-Site/default/JK_TestLocateStores-Start";
			String itemSku = "3051323";
			String itemQuantity = "1";
			String zip = "92806";
			String radius = "25";

			HttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(urlString);

			List<BasicNameValuePair> nameValuePairs = new ArrayList<BasicNameValuePair>(1);
			nameValuePairs.add(new BasicNameValuePair("itemSku", itemSku));
			nameValuePairs.add(new BasicNameValuePair("itemQuantity", itemQuantity));
			nameValuePairs.add(new BasicNameValuePair("zip", zip));
			nameValuePairs.add(new BasicNameValuePair("radius", radius));
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			HttpResponse response = client.execute(post);

			int httpStatusCode = response.getStatusLine().getStatusCode();

			if (httpStatusCode == 200) {
				String responseString = this.getResponseString(response);
				System.out.println("Response: " + responseString);
			} else {
				System.out.println("Http error occurred while calling DW rest api.");
			}
		} catch (Exception e) {
			log.error(StackTrace.getStackTrace(e));
			throw new Exception();
		}
	}

	public String getResponseString(HttpResponse response) throws IOException {

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
