package example;

import java.util.List;
import java.util.stream.Collectors;

public interface DataProcessor {
    default void processFullTimeEmployees(List<Employee> employees) {
        List<Employee> fullTimeEmployees = filterFullTimeEmployees(employees);
        processData(fullTimeEmployees);
    }

    default void processPartTimeEmployees(List<Employee> employees) {
        List<Employee> partTimeEmployees = filterPartTimeEmployees(employees);
        processData(partTimeEmployees);
    }

    private List<Employee> filterFullTimeEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.employmentType() == EmploymentType.FULL_TIME)
                .collect(Collectors.toList());
    }

    private List<Employee> filterPartTimeEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.employmentType() == EmploymentType.PART_TIME)
                .collect(Collectors.toList());
    }

    private void processData(List<Employee> employees) {
        // Employee processing logic (calculations, analysis, etc.)
        System.out.println("Processing data for " + employees.size() + " employees.");
    }
}
