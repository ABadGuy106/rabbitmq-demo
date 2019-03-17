package com.huaxia.rabbitmq.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
public class CreateQueueUtil {
	
	
	private static final Logger logger= LoggerFactory.getLogger(CreateQueueUtil.class);
	/**
	 * 创建队列
	 * @param queueName 队列名称
	 * @param isDurable 是否持久化队列内的信息
	 */
	public static void createQueue(String queueName,boolean isDurable) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-rabbitmq-send.xml");
		RabbitAdmin factory = (RabbitAdmin) ctx.getBean("rabbitAdmin");
		
		if(checkparameter(queueName)){
			Queue queue=new Queue(queueName, isDurable, false, false, null);
			try {
				factory.declareQueue(queue);
			}catch(Exception e) {
				logger.error("----队列创建失败------------parameters:[queueName='{}',isDurable='{}']",queueName,isDurable);
			}
		}else {
			logger.error("队列名称为空！");
		}
		
	}
	
	public static boolean checkparameter(String queueName) {
		if(queueName==null || queueName.equals("")) {
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		createQueue("test_qu",false);
	}
}
