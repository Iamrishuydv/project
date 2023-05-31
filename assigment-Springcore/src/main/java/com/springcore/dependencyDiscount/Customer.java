package com.springcore.dependencyDiscount;

public class Customer {
	private int customercode;
	private String customername;
	private String city;
	private double ordervalue;
	public int getCustomercode() {
		return customercode;
	}
	public void setCustomercode(int customercode) {
		this.customercode = customercode;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getOrdervalue() {
		return ordervalue;
	}
	public void setOrdervalue(double ordervalue) {
		this.ordervalue = ordervalue;
	}
	
	public double computeDiscount(double ordervalue) {
		double discount = 0;
		if(ordervalue > 25000) {
			discount = 0.1 * ordervalue;
		}
		else if(ordervalue > 10000 && ordervalue <= 25000)
		{
			discount = 0.05 * ordervalue;
		}
		double netamount = ordervalue-discount;
		return netamount;
	}
	
	
	
	public void Show_customer() {
		System.out.println("Customer code: " + customercode);
		System.out.println("Customer name: " + customername);
		System.out.println("Address: " + city);
		System.out.println("OrderValue: "+ordervalue);
		System.out.println("Net Amount: "+computeDiscount(ordervalue));
	}
}
