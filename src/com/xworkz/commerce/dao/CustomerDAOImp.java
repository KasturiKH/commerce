package com.xworkz.commerce.dao;

import com.xworkz.commerce.dto.CustomerDTO;

public class CustomerDAOImp implements CustomerDAO  {
	private CustomerDTO[] customerDTOa= new CustomerDTO[2];
	private int count=0;
	
	public CustomerDAOImp()
	{
		System.out.println("create "+ this.getClass().getSimpleName());
		
	}

	@Override
	public boolean save(CustomerDTO customerDTO) {
		if(this.count<this.customerDTOa.length)
		{
			this.customerDTOa[this.count]=customerDTO;
			System.out.println("Customer DTO is saved @ index" + this.count);
			this.count++;
			return true;
		}
		System.out.println("DTO array is Full");
		return false;
	}

	@Override
	public boolean findDTO(CustomerDTO customerDTO) {
		if(customerDTO!=null) {
			for(int i=0; i<customerDTOa.length; i++)
			if(this.customerDTOa[i]!=null && this.customerDTOa[i].equals(customerDTO)) {
				System.out.println("DTO is found");
				return true;
			}
		}
		System.out.println("DTO is  not found");
		return false;
		  
	  }
	@Override
	public CustomerDTO findByName(String name) {
     if (name!=null)
     {
    	 for(int i=0; i<customerDTOa.length; i++)
    	 {
    		 if(this.customerDTOa[i]!=null && this.customerDTOa[i].getName().equals(name)) {
    			 System.out.println("Customer Name is found @ DTO index " + i);
    			 return customerDTOa[i];
    		 }
    	 }
     }
     System.out.println("Customer Name is not found");
	return null;
	
	}

}