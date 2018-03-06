package com.pacsun.process;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

public class DemandwareJobCaller {

	private String jobName;
	private String userId;
	private String password;
	private String urlString;
	private int responseCode;

	private static final Logger log = Logger
			.getLogger(DemandwareJobCaller.class);

	public void run() throws ClientProtocolException, IOException {

		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(this.getUrlString());

		List<BasicNameValuePair> nameValuePairs = new ArrayList<BasicNameValuePair>(
				1);
		nameValuePairs.add(new BasicNameValuePair("UserId", this.getUserId()));
		nameValuePairs.add(new BasicNameValuePair("Password", this
				.getPassword()));
		nameValuePairs.add(new BasicNameValuePair("DemandwareJobName", this
				.getJobName()));

		post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		HttpResponse response = client.execute(post);
		int httpStatusCode = response.getStatusLine().getStatusCode();
		this.setResponseCode(httpStatusCode);
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrlString() {
		return urlString;
	}

	public void setUrlString(String urlString) {
		this.urlString = urlString;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

}
