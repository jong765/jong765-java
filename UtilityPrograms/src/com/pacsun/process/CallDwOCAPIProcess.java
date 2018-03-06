package com.pacsun.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

import com.pacsun.util.StackTrace;

public class CallDwOCAPIProcess {

	private String clientId = "";

	private static final Logger log = Logger.getLogger(CallDwOCAPIProcess.class);
	private String baseUrl = "https://staging.web.pacsun.demandware.net/s/Sites-pacsun-Site/dw/shop/v16_6";

	public void runGet(String url) throws Exception {

		try {

			String urlString = url + "?" + this.getClientId();

			HttpClient client = new DefaultHttpClient();
			HttpGet get = new HttpGet(urlString);

			HttpResponse response = client.execute(get);

			int httpStatusCode = response.getStatusLine().getStatusCode();

			if (httpStatusCode == 200) {
				String xmlString = this.getResponseXml(response);
				System.out.println("Response String:");
				System.out.println(xmlString);
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

	public void runPost(String url, String jsonString) throws Exception {

		try {

			String urlString = url + "?" + this.getClientId();

			HttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(urlString);
			post.addHeader("Accept", "application/json");
			post.addHeader("Content-Type", "application/json");

			post.setEntity(new StringEntity(jsonString, "UTF8"));

			HttpResponse response = client.execute(post);

			int httpStatusCode = response.getStatusLine().getStatusCode();

			System.out.println("URL string: " + urlString);
			System.out.println("Response: " + response.getStatusLine());

			if (httpStatusCode == 200) {
				String xmlString = this.getResponseXml(response);
				System.out.println(xmlString);

			} else {
				System.out.println("Http error occurred while calling DW rest api.");
			}
		} catch (Exception e) {
			log.error(StackTrace.getStackTrace(e));
			throw new Exception();
		}

	}

	public void addProduct(String productId, int quantity) throws Exception {
		String url = baseUrl + "/basket/this/add";
		String jsonString = "";
		JSONObject jo = new JSONObject();

		jo.put("product_id", productId);
		jo.put("quantity", quantity);
		jsonString = jo.toString();

		runPost(url, jsonString);

	}

	public void getProduct(String productId) throws Exception {
		String url = baseUrl + "/products/" + productId;
		runGet(url);

	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
}
