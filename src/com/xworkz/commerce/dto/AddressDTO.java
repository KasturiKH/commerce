package com.xworkz.commerce.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable{
	private int id;// >0 <1000
	private String street;//min 2 , max 100
	private String doorNo;//min 1
	private int pincode;// 6 digits 
	private StateDTO stateDTO;// valid state
	
	public AddressDTO() {
		System.out.println("AddressDTO " + this.getClass().getSimpleName());
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		if (id>0 && id<1000) {
			System.out.println("id is valid" +id);
			this.id = id;
			
		}else
		{
			System.out.println("id is not valid"+id);
		}
	}
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		
			if(street.length()>2 || street.length()<100) {
			System.out.println(" street is 2 and 100");
			this.street = street;
		}
			
		
	}
	
	
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		
		if(doorNo.length()>1)
		{
			System.out.println("the door number length should be more than one");
			this.doorNo = doorNo;
		}
		
	}
	
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		if(String.valueOf(pincode).length()==6) 
		{
		
		this.pincode = pincode;
		return;
		}
		System.out.println("The pincode should have Six numbers");
		
		
	}
	
	
	public StateDTO getStateDTO() {
		return stateDTO;
	}
	public void setStateDTO(StateDTO stateDTO) {
		if(stateDTO!=null)
		{
			this.stateDTO = stateDTO;	
		}
		
	}


}