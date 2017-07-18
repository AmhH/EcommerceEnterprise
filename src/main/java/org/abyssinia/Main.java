package org.abyssinia;

import java.util.List;

import org.abyssinia.domain.Address;
import org.abyssinia.persistance.service.AddressService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
		        "context/applicationContext.xml");
		
		AddressService addressService = (AddressService) ctx.getBean("addressServiceImpl");
		Address address = new Address();
		address.setCity("Fair");
		address.setState("IA");
		address.setZipCode("12345");
		addressService.save(address);
		
		System.out.println("Address inserted!");
		
		List<Address> list = addressService.findAll();
	    list = addressService.findAll();
	    System.out.println("Address count: " + list.size());

	}

}