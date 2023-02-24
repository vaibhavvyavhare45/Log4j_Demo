package com.prowings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

public class HelloJava {

	private static final Logger logger = LogManager.getLogger(HelloJava.class);

	public static void main(String[] args) throws InterruptedException {

		ThreadContext.put("Transaction id:", "1245588224");

		logger.fatal("Fatal Level event !! ");
		logger.error("Error Level event !! ");
		logger.warn("warn Level event !! ");
		logger.info("Info Level event !! ");
		logger.debug("Debug Level event !! ");
		logger.trace("Trace Level event !! ");
		addition(30,50);
		
		
	}

	private static void addition(int i, int j) throws InterruptedException {
		
		logger.info("addition method is started...");
		int  res=i+j;
		logger.info("result is{}",res);
		Thread.sleep(50000);
		
		logger.info("addition method is ended");
		
	}

}
