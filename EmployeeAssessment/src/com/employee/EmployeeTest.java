package com.employee;

import java.util.*;

import java.util.ArrayList;

public class EmployeeTest {

	

	public static void main(String[] args) {


		EmployeeManagement em = new EmployeeManagement();	

		
		 EmployeeManagement emp1 = new EmployeeManagement("Rishu", 12000);
		 EmployeeManagement emp2 = new EmployeeManagement("Mohan", 12000);
		 EmployeeManagement emp3 = new EmployeeManagement("Ram", 14000);
		 EmployeeManagement emp4 = new EmployeeManagement("Amit", 500000);
		
		List<EmployeeManagement> emp = new ArrayList<EmployeeManagement>(); 		
				
			emp.add(emp1);
			emp.add(emp2);
			emp.add(emp3);
			emp.add(emp4);
			

			Collections.sort(emp,Collections.reverseOrder());
				
				System.out.println(emp);
				

	}
	
	
}

							
						

