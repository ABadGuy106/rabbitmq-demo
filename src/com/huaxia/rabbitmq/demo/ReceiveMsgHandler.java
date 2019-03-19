package com.huaxia.rabbitmq.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ReceiveMsgHandler {
	private static final Logger logger= LoggerFactory.getLogger(ReceiveMsgHandler.class);

	public void handleMessage(String text) {  
        System.out.println("Received: " + text);  
    }  
}
