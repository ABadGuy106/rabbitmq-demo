package com.huaxia.rabbitmq.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huaxia.rabbitmq.demo.util.CreateQueueUtil;

public class RecvTest {
	
	private static final Logger logger= LoggerFactory.getLogger(RecvTest.class);

	static String queueName = "send_to_test";
	static boolean isDurable=true;

	
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring_mq_receive.xml");
//		//创建队列
//		CreateQueueUtil.createQueue(queueName, isDurable);
//		SimpleMessageListenerContainer listener = (SimpleMessageListenerContainer) ctx.getBean("listenerContainer");
//		listener.setQueueNames(queueName);
//		
//		listener.getQueueNames();
	}
}
