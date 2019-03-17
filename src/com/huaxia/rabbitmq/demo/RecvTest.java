package com.huaxia.rabbitmq.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RecvTest {

	static String queue = "send_to_test1";

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring_mq_receive.xml");
		SimpleMessageListenerContainer listener = (SimpleMessageListenerContainer) ctx.getBean("listenerContainer");
		listener.setQueueNames(queue);
	}
}
