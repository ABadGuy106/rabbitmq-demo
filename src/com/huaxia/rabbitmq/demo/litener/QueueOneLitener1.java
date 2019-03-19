package com.huaxia.rabbitmq.demo.litener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class QueueOneLitener1 implements MessageListener{

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		System.out.println("[2] -------接收到的信息:"+new String(message.getBody()));
	}

}
