package com.example.EmployeeSpringboot.service;

import com.example.EmployeeSpringboot.dto.EmployeeDto;
import com.example.EmployeeSpringboot.module.Employee;
import com.example.EmployeeSpringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee>getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Employee createEmployee(EmployeeDto employeeDto){
        Employee employee=Employee.build(0,employeeDto.getFirstName(),employeeDto.getLastName(),employeeDto.getAddress(), employeeDto.getEmail(), employeeDto.getSalary());
        return employeeRepository.save(employee);
    }
}
