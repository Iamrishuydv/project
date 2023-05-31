package com.capgemini.rest.tutorial1;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonInclude;


@RestController
public class NewController {

	
	@RequestMapping(value = "/students", method = RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public ArrayList<Student> students()
	{
		ArrayList<Student> list = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setName("Rishu");
		
		Student student2 = new Student();
		student2.setName("Prem");
		
		Student student3 = new Student();
		student3.setName("hello");
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		return list;
	}
	
	@RequestMapping(value="/students/{name}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateStudent(@PathVariable("name") String studentName, @RequestBody Student student) {
		
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Name: " + student.getName()+ "Student Hobby : " + student.getCity());
		
//		return true;
		
//		Student student = new Student();
//		student.setName(studentname);
//		student.setCity("mumbai");
//		return student;
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}