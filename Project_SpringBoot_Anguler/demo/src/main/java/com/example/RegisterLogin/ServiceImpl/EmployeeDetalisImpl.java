package com.example.RegisterLogin.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RegisterLogin.Model.EmployeeDetalis;
import com.example.RegisterLogin.Repo.EmployeeDetalisRepo;
import com.example.RegisterLogin.Service.EmployeeDetalisService;

@Service
public class EmployeeDetalisImpl implements EmployeeDetalisService {

      @Autowired	
	  private EmployeeDetalisRepo repo;
	
	@Override
	public EmployeeDetalis SaveEmployeeDetalis(EmployeeDetalis employeeDetalis) {
		// TODO Auto-generated method stub
		return repo.save(employeeDetalis);
	}

	@Override
	public List<EmployeeDetalis> getAllEmployeeDetalis() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public EmployeeDetalis updateById(EmployeeDetalis employeeDetalis) {
		// TODO Auto-generated method stub
		return repo.save(employeeDetalis);
	}

	@Override
	public void getDeleteById(Integer employeeid) {
		// TODO Auto-generated method stub
		repo.deleteById(employeeid);
	}

	
	

}
