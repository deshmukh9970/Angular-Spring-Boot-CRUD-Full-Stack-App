package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.EmployeeDTO;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Response.LoginMesage;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginMesage loginEmployee(LoginDTO loginDTO);

}
