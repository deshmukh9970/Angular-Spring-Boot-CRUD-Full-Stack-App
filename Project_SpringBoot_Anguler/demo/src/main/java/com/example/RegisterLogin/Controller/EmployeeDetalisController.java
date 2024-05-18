package com.example.RegisterLogin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RegisterLogin.Model.EmployeeDetalis;
import com.example.RegisterLogin.Service.EmployeeDetalisService;
import com.example.RegisterLogin.ServiceImpl.EmployeeDetalisImpl;


@RestController
@CrossOrigin
@RequestMapping("api/v2")
public class EmployeeDetalisController {
	
	@Autowired
	private EmployeeDetalisImpl employeeDetalisImpl;
	
	 @PostMapping(path = "/saveemp")
	public ResponseEntity<EmployeeDetalis> createEmployeeDetalis(@RequestBody EmployeeDetalis employeeDetalis)
	{
		EmployeeDetalis createEmployeeDetalis=this.employeeDetalisImpl.SaveEmployeeDetalis(employeeDetalis);
		System.out.println(createEmployeeDetalis);
		
		return ResponseEntity.ok().body(createEmployeeDetalis);
	}
	 
	 
	 @GetMapping("/all")
	    public ResponseEntity<List<EmployeeDetalis>> getAllEmployees() {
	        List<EmployeeDetalis> employees = employeeDetalisImpl.getAllEmployeeDetalis();
	        return ResponseEntity.ok(employees);
	    }

	 @PutMapping("/employee/{id}")
	    public EmployeeDetalis updateEmployee(@PathVariable("id") Long id, @RequestBody EmployeeDetalis employeeDetalis) {
	        return employeeDetalisImpl.updateById(employeeDetalis);
	    }

	    @DeleteMapping("/employee/{id}")
	    public void deleteEmployee(@RequestBody Integer id) {
	    	
	        employeeDetalisImpl.getDeleteById(id);
	    }

}
