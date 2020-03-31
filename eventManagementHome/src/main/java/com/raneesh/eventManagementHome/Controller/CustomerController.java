package com.raneesh.eventManagementHome.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raneesh.eventManagementHome.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService custService;

	@GetMapping("/getCustomers")
	public List<String> enterCustDetails() {
		
		List<String> listObj = new ArrayList<>();
		
		listObj  = custService.returnCustomer();
		
		System.out.println(listObj);
		return listObj;
	}
	@PostMapping("/enterCustomers/{name}")
	public List getCustDetails(@PathVariable String name) {
		
		List<String> listObj = new ArrayList<>();
		System.out.println(name);
		 custService.createCustomer(name);
		
		System.out.println("List Saved successfully");
		return listObj;
	}
	
	
}
