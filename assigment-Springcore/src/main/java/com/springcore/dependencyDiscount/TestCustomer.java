package com.springcore.dependencyDiscount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/dependencyDiscount/bean.xml"); 
		Customer cus = (Customer)context.getBean("cust");
		cus.Show_customer();
	
	}

}
