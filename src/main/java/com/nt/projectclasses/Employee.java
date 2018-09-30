package com.nt.projectclasses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.nt.customanotations.CheckMobile;


@Entity

@Table
public class Employee {
	
	
	@Id
	Long sid;
	
	//@NotNull
	String name;
	
	//@NotNull
	
	@CheckMobile(max = 10)
	String mobileno;
	
	@Email
	String email;

	

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", name=" + name + ", mobileno=" + mobileno + ", email=" + email + "]";
	}
	
	
	

}
