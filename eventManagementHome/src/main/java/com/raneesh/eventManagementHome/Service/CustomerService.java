package com.raneesh.eventManagementHome.Service;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	java.util.List<String> listObj = new ArrayList<>();
	public String createCustomer(String name) {
		
		
		
		if(name != null ) {
			listObj.add(name);
			return "Success";
		}
		
		else {
			return "Failure";
		}
		
	}
	
	public java.util.List<String> returnCustomer() {
		
		return listObj;
	}

}
