package com.pacsun.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SftpUtilTest {

	SftpUtil sftpUtil = new SftpUtil();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String sftpHost = "files.hingeto.com";
		String sftpUser = "pacsun-staging";
		String sftpPassword = "DropShip2017!";
		String sftpDir = "misc";
		sftpUtil.setSftpHost(sftpHost);
		sftpUtil.setSftpUser(sftpUser);
		sftpUtil.setSftpPassword(sftpPassword);
		sftpUtil.setSftpDir(sftpDir);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSend() throws Exception {
		List<File> fileList = new ArrayList<File>();
		File file = new File("Custom/QUA/ftp/file/Test.txt");
		fileList.add(file);
		// file = new File("Custom/QUA/ftp/file/aatest2.xml");
		// fileList.add(file);
		sftpUtil.sendFiles(fileList);
	}

	@Test
	public void testReceive() throws Exception {
		sftpUtil.receiveFiles("Custom/QUA/ftp/testout/", "aa*.xml");

	}

}
