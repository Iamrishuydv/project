package com.springcore.dependencyBook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDetails {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/dependencyBook/Bookbean.xml");
		Book book = (Book) context.getBean("book1");
		System.out.println(book);
	}

}
