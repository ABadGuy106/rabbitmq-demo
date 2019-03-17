package com.huaxia.rabbitmq.demo;

public class ReceiveMsgHandler {

	public void handleMessage(String text) {  
        System.out.println("Received: " + text);  
    }  
}
