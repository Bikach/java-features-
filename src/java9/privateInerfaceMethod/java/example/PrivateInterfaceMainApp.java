package example;

import java.util.List;

import static example.EmploymentType.FULL_TIME;
import static example.EmploymentType.PART_TIME;

public class PrivateInterfaceMainApp {
    public static void main(String[] args) {
        var employees = List.of(new Employee(FULL_TIME), new Employee(PART_TIME), new Employee(FULL_TIME), new Employee(FULL_TIME));
        var processor = new EmployeeDataProcessor();
        processor.processFullTimeEmployees(employees);
        processor.processPartTimeEmployees(employees);
    }
}
