//Given a collection of 10 employee objects sort all employees on the basis of

//1) Name
//2) salary


package com.collection.salary;

public class salarysort {

	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public salarysort(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	
	
}
