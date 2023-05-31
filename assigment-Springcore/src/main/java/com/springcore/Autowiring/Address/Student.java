package com.springcore.Autowiring.Address;

public class Student {

	private int StudentCode;
	private String StudentName;
	private Address StuAdd;
	public int getStudentCode() {
		return StudentCode;
	}
	public void setStudentCode(int studentCode) {
		StudentCode = studentCode;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Address getStuAdd() {
		return StuAdd;
	}
	public void setStuAdd(Address stuAdd) {
		StuAdd = stuAdd;
	}
	
	
}
