package com.employee;

 class EmployeeManagement implements Comparable<EmployeeManagement> {

	public String name;
	public double salary;
	

	public EmployeeManagement(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeManagement() {
		super();		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Employee [name=%s, Salary=%s]", name, salary);
	}
	
	public int compareTo(EmployeeManagement other) {
		if(this.salary<other.salary) {
			return -1;
		}else if(this.salary>other.salary) {
			return 1;
		}else {
			return 0;
		}
	}

	
}

