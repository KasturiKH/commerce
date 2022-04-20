package com.xworkz.commerce.service;

import com.xworkz.commerce.dao.CustomerDAO;
import com.xworkz.commerce.dto.CustomerDTO;

public class CustomerServiceImp implements CustomerService {
	
	private CustomerDAO customerDAO;

	public CustomerServiceImp(CustomerDAO customerDAO) {
		if(customerDAO!=null) {
			this.customerDAO=customerDAO;
			System.out.println("Created " +this.getClass().getSimpleName());
			return;
			
		}
	    System.out.println("CustomerDAO is null");
	}

	@Override
	public boolean validateAndSave(CustomerDTO customerDTO) {
          if(customerDTO!=null)
          {
        	  if(customerDTO.getId()<=0)
        	  {
        		  System.out.println("id is incorrect");
        		  
        	  }
        	  return false;
          }
		
	

	if (customerDTO.getName()==null ||customerDTO.getName().length()<3 ||customerDTO.getName().length()>50) {
		System.out.println("Customer name is  invalid");
		return false;
	}
	if (customerDTO.getCustomerId()<=0) {
		System.out.println("CustomerID is invalid");
		return false;
	}
	if (customerDTO.getEmail()==null || customerDTO.getEmail().length()>4 || customerDTO.getEmail().length()<=60 || !customerDTO.getEmail().contains("@")
		        || !(customerDTO.getEmail().endsWith(".com") ||customerDTO.getEmail().endsWith(".in") ||customerDTO.getEmail().endsWith(".edu")))
    {
    	System.out.println("Customer Email is incorrect");
    	return false;
			
		}
	
	
	
    if(customerDTO.getCustomerType()== null)
    {
    	System.out.println("Customer Type is invalid");
    	return false;
    }
    
    if(customerDTO.getAlternativeEmail() == null ||customerDTO.getAlternativeEmail().length()<5 ||customerDTO.getAlternativeEmail().length()>45 || !customerDTO.getEmail().contains("@")
    		 || !(customerDTO.getEmail().endsWith(".com") ||customerDTO.getEmail().endsWith(".in") ||customerDTO.getEmail().endsWith(".edu"))) {
    	System.out.println("Customer Email is incorrect");
    	return false;
    	}
    if(customerDTO.getAddressDTO()==null) {
    	System.out.println("Customer Address is invalid");
    	return false;
    }
    boolean found=customerDAO.findDTO(customerDTO);
    if(found) {
    	System.out.println("can not added");
    	return false;
    }else {
    	System.out.println("Customer details are correct");
    	return true;
    }
    
	}
	
	@Override
	public CustomerDTO findByName(String name) {
		if(name!=null) {
			CustomerDTO dtoFound=customerDAO.findByName(name);
			return dtoFound;
		}
		System.out.println("Name is not found");
		return null;
	}
}