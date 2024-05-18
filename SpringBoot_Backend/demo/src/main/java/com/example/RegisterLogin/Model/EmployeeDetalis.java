package com.example.RegisterLogin.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeeDetalis")
public class EmployeeDetalis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeid;
	private String employeename;
	private String  email;
	private String city;
	private String contact;
	
	public EmployeeDetalis()
	{
		
	}

	public EmployeeDetalis(int employeeid, String employeename, String email, String city, String contact) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.email = email;
		this.city = city;
		this.contact = contact;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "EmployeeDetalis [employeeid=" + employeeid + ", employeename=" + employeename + ", email=" + email
				+ ", city=" + city + ", contact=" + contact + "]";
	}
	
	

}
