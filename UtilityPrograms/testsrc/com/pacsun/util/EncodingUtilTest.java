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
    String str = "jjK1247%";
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