package com.example.mainApp;

import com.example.department.Department;
import com.example.employee.Civility;
import com.example.employee.Employee;

public class Main {
    public static void main(String[] args) {
        var alice = new Employee(Civility.MRS, "Alice", "Dupont");
        var henry = new Employee(Civility.MR, "Henry", "Tran");

        var department = new Department("IT");
        department.addEmployee(alice);
        department.addEmployee(henry);

        department.showEmployees();
    }
}
