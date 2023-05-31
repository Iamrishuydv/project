package com.collection.salary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collection.*;


public class namesalary {

	List<Double> salaryList = new ArrayList<Double>();
	List<namesalary> employeeList = new ArrayList<>();
	
	salarysort name1 = new salarysort("Rishu", 12000);
	salarysort name2 = new salarysort("Amar", 14000);
	salarysort name3 = new salarysort("Mohan", 12000);
	salarysort name4 = new salarysort("Ram", 14000);
	
	
	
	Collections.sort(salaryList);
	if(employeeList.size()<3)
	{
		for(int i=name.size()-1;i>=0;i--) {
			System.out.println(name.get(i));
		}
	
	
		else
		{
			for (int i=nameList.size()-1;i>nameList.size()-4;i--) {
				for(int j=employeeList.size()-1;j>salaryList.size()-4;j--)
				{
					
					if(salaryList.get(i)==employeeList.get(j).getSalary())
					{
						System.out.println(employeeList.get(j));
						continue;
					}
					
				}
		