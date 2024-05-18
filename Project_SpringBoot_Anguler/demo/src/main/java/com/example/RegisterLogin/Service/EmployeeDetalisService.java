package com.example.RegisterLogin.Service;

import java.util.List;

import com.example.RegisterLogin.Model.EmployeeDetalis;

public interface EmployeeDetalisService {
	
	public EmployeeDetalis SaveEmployeeDetalis(EmployeeDetalis employeeDetalis);
	
	public List<EmployeeDetalis> getAllEmployeeDetalis();
	
	public EmployeeDetalis updateById(EmployeeDetalis employeeDetalis);
	
	public void getDeleteById(Integer employeeid);
	
	
}
