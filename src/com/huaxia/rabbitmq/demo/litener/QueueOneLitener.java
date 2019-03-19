package com.huaxia.rabbitmq.demo.litener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class QueueOneLitener{


	public void litener(Message message) {
		System.out.println("接收到的信息:"+message);
		
	}

}
