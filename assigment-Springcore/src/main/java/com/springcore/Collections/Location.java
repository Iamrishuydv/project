package com.springcore.Collections;

import java.util.List;

public class Location {
	private String locationcode;
	private String locationname;
	private List<String> batch;
	
	public String getLocationcode() {
		return locationcode;
	}
	public void setLocationcode(String locationcode) {
		this.locationcode = locationcode;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	
	public List<String> getBatch() {
		return batch;
	}
	public void setBatch(List<String> batch) {
		this.batch = batch;
	}
	
	public void displayinfo() {
		System.out.println("Location is Banglore");
		System.out.println("Batches in that Location are");
		for(String s:batch) {
			System.out.println(s);
		}
	}
}
