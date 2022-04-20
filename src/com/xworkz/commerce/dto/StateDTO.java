package com.xworkz.commerce.dto;

import java.io.Serializable;

public class StateDTO implements Serializable {
	
	private int id;//>0 < 2000
	private String name;//min 3 , max 40
	private int noOfDistricts; //>0 , <100
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<=0 || id>2000) {
		System.out.println("id is 0 to 2000");
		return;
		}
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null) {
			if(name.length()>3 || name.length()<40) {
				System.out.println("name  is 3 to 40");
				this.name = name;
			} 
		}
		
		
	}
	public int getNoOfDistricts() {
		return noOfDistricts;
	}
	public void setNoOfDistricts(int noOfDistricts) {
		if(noOfDistricts>0 || noOfDistricts<100) {
			System.out.println("districts are" +noOfDistricts);
		}
		this.noOfDistricts = noOfDistricts;
	}



}