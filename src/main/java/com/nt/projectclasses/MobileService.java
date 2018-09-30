package com.nt.projectclasses;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {
	@Autowired
	MobileDao dao;
	
	
	@Transactional
	public Employee insert(Employee emp){
		System.out.println("hi");
		return dao.save(emp);
	}

}
