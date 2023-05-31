package com.springcore.Autowiring.Address;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Autowiring/Address/autoconfig.xml");
		Student St = (Student) context.getBean("stu");
		
		//Address ad = (Address) context.getBean("stu");
		
		System.out.println("Student Code: "+St.getStudentCode());
		System.out.println("Student Name: " + St.getStudentName());
		System.out.println(St.getStuAdd());
		
	}

}
