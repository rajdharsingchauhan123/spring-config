package com.example.EmployeeSpringboot.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer UserId;
    private String FirstName;
    private String lastName;
    private String email;
    private String address;
    private  Double salary;
}
