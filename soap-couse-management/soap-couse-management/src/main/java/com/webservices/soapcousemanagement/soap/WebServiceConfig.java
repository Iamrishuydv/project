package com.webservices.soapcousemanagement.soap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs //Enable Spring Web Services

@Configuration  //Spring Configuration
public class WebServiceConfig {
	//MessageDispatcherServlet
		//ApplicationConntext
	//url -> /ws/*
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true); 
		return new ServletRegistrationBean (messageDispatcherServlet, "/ws/*");
	}
	// /ws/courses.wsdl
		
	// course.details.xsd
	@Bean(name="courses")
	public DefaultWsdl11Definition defaultWsd11Definition
	(XsdSchema coursesSchema) {
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		
		definition.setPortTypeName("CoursePort");
		definition.setTargetNamespace("http://in28minutes.com/courses");
		definition.setLocationUri("/ws");
		definition.setSchema(coursesSchema);
		
		return definition; 
	}
	
	@Bean
	XsdSchema coursesSchema() {
		return new SimpleXsdSchema(new ClassPathResource("course-details.xsd"));
	}
	
} 
