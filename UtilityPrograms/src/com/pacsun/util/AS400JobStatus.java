package com.pacsun.util;

import java.beans.PropertyVetoException;
import java.util.Enumeration;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.Job;
import com.ibm.as400.access.JobList;

public class AS400JobStatus {

	private String systemName;
	private String userName;
	private String password;

	public boolean isActive(String jobName) throws Exception {

		// AS400 system = new AS400(systemName, userName, password);
		AS400 system = new AS400(systemName);
		boolean isActive = false;

		JobList jobList = new JobList(system);
		try {
			jobList.addJobSelectionCriteria(JobList.SELECTION_JOB_NAME, jobName);
		} catch (PropertyVetoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Enumeration<?> jobEnum = null;
		try {
			jobEnum = jobList.getJobs();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (jobEnum.hasMoreElements()) {
			Job job = (Job) jobEnum.nextElement();
			if (job.getStatus().equalsIgnoreCase("*Active")) {
				isActive = true;
				break;
			}
		}

		return isActive;

	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
