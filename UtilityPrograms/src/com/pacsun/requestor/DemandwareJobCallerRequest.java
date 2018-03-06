package com.pacsun.requestor;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.pacsun.process.DemandwareJobCaller;

public class DemandwareJobCallerRequest {

	public static void main(String[] args) {

		DemandwareJobCaller jobCaller = new DemandwareJobCaller();
		jobCaller.setJobName("JK_TestJob");
		jobCaller.setUserId("pacsunip");
		jobCaller.setPassword("pip3873#T");
		jobCaller.setUrlString("https://dev04.web.pacsun.demandware.net/on/demandware.store/Sites-pacsun-Site/default/JK_RemoteJobEntry-Start");
		
		try {
			jobCaller.run();
			System.out.println("Response code: " + jobCaller.getResponseCode());
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
