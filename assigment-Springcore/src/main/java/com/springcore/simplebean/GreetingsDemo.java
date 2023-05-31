package com.springcore.simplebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/simplebean/applicationContext.xml"); 
		Welcome w = (Welcome)context.getBean("m1");
		System.out.println(w);
	
	}

}
