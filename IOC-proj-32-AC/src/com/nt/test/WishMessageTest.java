package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.WishMessage;

public class WishMessageTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessage msg=null;
		
		// create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfg/applicatinContext.xml");
		
		//get beans
		msg=ctx.getBean("wmg",WishMessage.class);
		
		msg.getMessage("santosh");

	}

}
