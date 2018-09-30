package com.nt.projectclasses;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileStoreController {

	
	@Autowired
	private MobileService service;
	
	@PostMapping(value="insert"
			,produces="application/json")
	

	public Employee customerDetailSend(@RequestParam("sid") Long sid,
			@RequestParam("name") String name,
			@RequestParam("mobileno") String mobileno,
			@RequestParam("email") String email) {
		
		
		Employee e=new Employee();
		e.setSid(sid);
		e.setName(name);
		e.setEmail(email);
		e.setMobileno(mobileno);
		
		System.out.println("hi");
		Employee e1=service.insert(e);
		System.out.println(e1);
		return e1;
		
		
		
		
	}
	
	@PostMapping(value="insert1"
			 ,consumes="application/json",produces="application/json")
	

	public Employee customerDetailSend1( Employee e) {
		
		System.out.println(e);
		
		System.out.println("hi");
		Employee e1=service.insert(e);
		System.out.println(e1);
		return e1;
		
		
		
		
	}
}
