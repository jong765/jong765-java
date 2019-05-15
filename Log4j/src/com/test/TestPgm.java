package com.test;

import org.apache.log4j.Logger;

public class TestPgm{
	
	final static Logger logger = Logger.getLogger(TestPgm.class);
	
	public static void main(String[] args) {
	
		TestPgm obj = new TestPgm();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){
			logger.error("Sorry, something wrong!", ex);
		}
		
	}
	
	private void divide(){
		@SuppressWarnings("unused")
		int i = 10 /0;
	}
	
}
