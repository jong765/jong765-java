package com.pacsun.util;

import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EncodingUtilTest
{
  @BeforeClass
  public static void setUpBeforeClass()
    throws Exception
  {
  }

  @AfterClass
  public static void tearDownAfterClass()
    throws Exception
  {
  }

  @Before
  public void setUp()
    throws Exception
  {
  }

  @After
  public void tearDown()
    throws Exception
  {
  }

  @Test
  public void testEncode()
  {
    String str = "100100082:434b004fd9cd0dcbea807f7ad2ac0889d7bb5751a1a0dca94ccfaebb5fb7f3cadb8be76b2caef864d0f05149a27b7ebd0a5d3635c4555c849f5013c8b210bc70";
    System.out.println("Encoded value " + EncodingUtil.encode(str));
  }
  @Test
  public void testDecode() {
    String str = "MzI6YWJjZGVmZ2g=";
    System.out.println("Decoded value " + EncodingUtil.decode(str));
  }
}

/* Location:           C:\eclipse_workspace\HingeTo\Custom\QUA\lib\ps_hingeto_common.jar
 * Qualified Name:     com.pacsun.util.EncodingUtilTest
 * JD-Core Version:    0.6.0
 */