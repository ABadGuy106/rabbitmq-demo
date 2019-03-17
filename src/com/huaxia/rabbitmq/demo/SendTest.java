package com.huaxia.rabbitmq.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huaxia.rabbitmq.demo.util.CreateQueueUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class SendTest {

	static String queueName = "send_to_test";
	static boolean isDurable=true;

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-rabbitmq-send.xml");
		RabbitTemplate template = (RabbitTemplate) ctx.getBean("rabbitTemplate");

		//创建队列
		CreateQueueUtil.createQueue(queueName, isDurable);
		
		template.setRoutingKey(queueName);
		for (int i = 0; i < 50; i++) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = sf.format(new Date());

			template.convertAndSend(i + "-------------test spring async=>" + time);
		}

	}
}
