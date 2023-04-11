package com.example.department;

import com.example.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private final List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees(){
        System.out.println("Department: " + this.name);
        this.employees.forEach(employee -> System.out.println("Employee: " + employee.fullName()));
    }
}


