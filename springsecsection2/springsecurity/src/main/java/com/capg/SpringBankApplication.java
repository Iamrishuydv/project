package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.capg.controller")
public class SpringBankApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBankApplication.class, args);
	}

}
