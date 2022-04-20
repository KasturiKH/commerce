package com.xworkz.commerce;

import com.xworkz.commerce.constants.CustomerType;
import com.xworkz.commerce.dao.CustomerDAO;
import com.xworkz.commerce.dao.CustomerDAOImp;
import com.xworkz.commerce.dto.AddressDTO;
import com.xworkz.commerce.dto.CustomerDTO;
import com.xworkz.commerce.dto.StateDTO;
import com.xworkz.commerce.service.CustomerService;
import com.xworkz.commerce.service.CustomerServiceImp;

public class CustomerRunner {

	public static void main(String[] args) {
		
			StateDTO stateDTO=new StateDTO();
			stateDTO.setId(30);
			stateDTO.setName("Bangalore");
			stateDTO.setNoOfDistricts(1);
			
			StateDTO stateDTO1=new StateDTO();
			stateDTO1.setId(3);
			stateDTO1.setName("Mysore");
			stateDTO1.setNoOfDistricts(3);
			
			StateDTO stateDTO2=new StateDTO();
			stateDTO2.setId(3);
			stateDTO2.setName("Mysore");
			stateDTO2.setNoOfDistricts(5);
					
			
			AddressDTO addressDTO=new AddressDTO();
			addressDTO.setId(31);
			addressDTO.setStreet("Belagavi");
			addressDTO.setDoorNo("2852");
			addressDTO.setPincode(590001);
			addressDTO.setStateDTO(stateDTO);
			
			AddressDTO addressDTO1=new AddressDTO();
			addressDTO1.setId(31);
			addressDTO1.setStreet("Dharwad");
			addressDTO1.setDoorNo("285");
			addressDTO1.setPincode(590010);
			addressDTO1.setStateDTO(stateDTO1);
			
			AddressDTO addressDTO2=new AddressDTO();
			addressDTO2.setId(31);
			addressDTO2.setStreet("Hubli");
			addressDTO2.setDoorNo("2582");
			addressDTO2.setPincode(590016);
			addressDTO2.setStateDTO(stateDTO2);
			
			
			CustomerDTO Customerdto=new CustomerDTO();
			Customerdto.setId(34);
			Customerdto.setName("Kasturi");
			Customerdto.setCustomerId(306);
			Customerdto.setMobile(636267127);
			Customerdto.setAlternativeMobile(734949241);
			Customerdto.setEmail("kasturikh001@gmail.com");
			Customerdto.setCustomerType(CustomerType.SILVER);
			Customerdto.setAlternativeEmail("kasturiah001@gmail");
			Customerdto.setAddressDTO(addressDTO);
			
			CustomerDTO Customerdto1=new CustomerDTO();
			Customerdto1.setId(34);
			Customerdto1.setName("Kavya");
			Customerdto1.setCustomerId(304);
			Customerdto1.setMobile(63626000);
			Customerdto1.setAlternativeMobile(734949111);
			Customerdto1.setEmail("kavya001@gmail.com");
			Customerdto1.setCustomerType(CustomerType.SILVER);
			Customerdto1.setAlternativeEmail("kavya002@gmail");
			Customerdto1.setAddressDTO(addressDTO1);
			
			CustomerDTO Customerdto2=new CustomerDTO();
			Customerdto2.setId(34);
			Customerdto2.setName("Shashi");
			Customerdto2.setCustomerId(307);
			Customerdto2.setMobile(636267122);
			Customerdto2.setAlternativeMobile(734949244);
			Customerdto2.setEmail("shashi001@gmail.com");
			Customerdto2.setCustomerType(CustomerType.SILVER);
			Customerdto2.setAlternativeEmail("shashi00@gmail");
			Customerdto2.setAddressDTO(addressDTO2);
			
			
			CustomerDAO customerdao=new CustomerDAOImp();  
			
		    CustomerService customerService=new CustomerServiceImp(customerdao);
		    
			customerService.validateAndSave(Customerdto);
			

		}




	}


