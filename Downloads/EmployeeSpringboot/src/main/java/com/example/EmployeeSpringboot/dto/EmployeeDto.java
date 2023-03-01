package com.example.EmployeeSpringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private String FirstName;
    private String lastName;
    private String email;
    private String address;
    private  Double salary;
}
