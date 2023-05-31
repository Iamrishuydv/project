package com.springcore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Collections/batchconfig.xml");
		Batch bat = (Batch) context.getBean("batch1");
		System.out.println(bat);
		
		Location loc = (Location) context.getBean("location");
		loc.displayinfo();
	}

}
