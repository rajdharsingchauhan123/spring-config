package com.example.EmployeeSpringboot.controller;

import com.example.EmployeeSpringboot.dto.EmployeeDto;
import com.example.EmployeeSpringboot.module.Employee;
import com.example.EmployeeSpringboot.repository.EmployeeRepository;
import com.example.EmployeeSpringboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepository employeeRepository;

    public ResponseEntity<List<Employee>>getAllEmployee(){
        return new ResponseEntity<List<Employee>>( employeeService.getAllEmployee(), HttpStatus.ACCEPTED);

    }
    public ResponseEntity<Employee>createEmployee(EmployeeDto employeeDto){
        return new ResponseEntity<Employee>(employeeService.createEmployee(employeeDto),HttpStatus.CREATED);
    }

}
