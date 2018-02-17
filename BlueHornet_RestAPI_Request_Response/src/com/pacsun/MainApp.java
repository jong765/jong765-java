package com.pacsun;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp {

	Logger log = LoggerFactory.getLogger(MainApp.class);
	
	private String bhURL;
	private String bhAPIKey;
	private String bhSecretKey;

	public static void main(String[] args) {

		MainApp app = new MainApp();
		app.setBhURL("https://echo7.bluehornet.com/api/xmlrpc/index.php");
		app.setBhAPIKey("d662c842e6c81fce922dd6df854d6e9f");
		app.setBhSecretKey("0d72f8b131804f5de0894fc9c0df2f13");
		
		String reqXML = "<methodCall>" +
				"<methodName>statistics.getMessageSubscriberData</methodName>" +
				"<mess_id>7823140</mess_id>" +
				"<start_date>2014-05-01 00:00:00</start_date>" +
				"<end_date>2014-05-01 23:00:00</end_date>" +
				"</methodCall>";
		
		String responseXML = app.sendRequest(reqXML);
		System.out.println(responseXML);

	}

	public String sendRequest(String reqXML) {

		log.debug("<----- BH API Request Begin ------>\n" + reqXML
				+ "\n<----- BH API Request End ------>");

		try {
			String respXML = Request
					.Post(bhURL)
					.bodyString(wrapRequest(reqXML),
							ContentType.APPLICATION_XML).execute()
					.returnContent().asString();
			log.debug("\n<----- BH API Response Begin ------>\n" + respXML
					+ "\n<----- BH API Repsonse End ------>");
			return respXML;
		} catch (ClientProtocolException e) {
			log.error("client protocol exception");
			return null;
		} catch (IOException e) {
			log.error("io exception");
			return null;
		}
	}

	public String wrapRequest(String reqXML) {
		return "<api>" + "<authentication>" + "<api_key>" + bhAPIKey
				+ "</api_key>" + "<shared_secret>" + bhSecretKey
				+ "</shared_secret>" + "</authentication>" + "<data>" + reqXML
				+ "</data>" + "</api>";
	}

	public String getBhURL() {
		return bhURL;
	}

	public void setBhURL(String bhURL) {
		this.bhURL = bhURL;
	}

	public String getBhAPIKey() {
		return bhAPIKey;
	}

	public void setBhAPIKey(String bhAPIKey) {
		this.bhAPIKey = bhAPIKey;
	}

	public String getBhSecretKey() {
		return bhSecretKey;
	}

	public void setBhSecretKey(String bhSecretKey) {
		this.bhSecretKey = bhSecretKey;
	}

}
