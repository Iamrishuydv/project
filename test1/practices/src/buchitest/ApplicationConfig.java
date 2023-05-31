package com.employee;

import java.util.*;

public class ApplicationConfig {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		EmployeeManagement em = new EmployeeManagement();
		boolean flag = true;
		List<Double> salaryList = new ArrayList<Double>();
		List<EmployeeManagement> employeeList = new ArrayList<>();
		while (flag != false) {
			System.out.println("enter a choice of yours");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {

				System.out.println("Enter your name : ");
				String name = scanner.next();
				System.out.println("Enter your designation");
				String designation = scanner.next();
				System.out.println("Enter your salary");
				double salary = scanner.nextDouble();
				EmployeeManagement em1 = new EmployeeManagement(name,designation,salary);
				employeeList.add(em1);
				salaryList.add(em1.getSalary());
				
				break;
			}
			case 2: {
				Collections.sort(salaryList);
				if(salaryList.size()==0)
				{
					System.out.println("you didnt have any items to display");
					return;
				}
				else if(salaryList.size()<3)
				{
					for(int i=salaryList.size()-1;i>=0;i--) {
						System.out.println(employeeList.get(i));
					}
				}
				else
				{
//					for(int i=salaryList.size()-1;;i--) {
//						System.out.println(employeeList.get(i));
//					}
					for (int i=salaryList.size()-1;i>salaryList.size()-4;i--) {
						for(int j=employeeList.size()-1;j>salaryList.size()-4;j--)
						{
							
							if(salaryList.get(i)==employeeList.get(j).getSalary())
							{
								System.out.println(employeeList.get(j));
								continue;
							}
							
						}
						
					}
				}
				
				flag=false;
				break;
			}
			case 3: {
				flag = false;
				break;
			}
			default: {
				System.out.println("Enter a correct choice");
			}
			}
		}

	}
}
