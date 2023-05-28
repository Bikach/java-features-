# Creating a Modular Application with Java 9


The Java 9 Module System brings a new level of modularity and organization to Java applications, allowing developers to better manage dependencies, encapsulate implementation details, and improve the overall maintainability of their code. In this article, we will walk through an example of a modular application featuring employees and departments, utilizing a custom directory structure.

----

### Directory Structure
The directory structure for our example application is as follows:
```
project
│
    └───src 
        └───java9
            └───moduleSystem
                └───employee
                    └───main
                        └───java
                        ├───module-info.java
                        └───com
                            └───example
                                └───employee
                                    ├───Employee.java
                                    └───Civility.java
                └───department
                    └───main
                        └───java
                            ├───module-info.java
                            └───com
                                └───example
                                    └───department
                                        └───Department.java
                └───mainApp
                    └───main
                        └───java
                        ├───module-info.java
                        └───com
                            └───example
                                └───mainApp
                                 └───Main.java
```

----

### Module Descriptors

Each module has a `module-info.java` file that defines the module's dependencies, exported packages, and other related information. Here are the module descriptors for our three modules

#### employee/module-info.java:
```
module com.example.employee {
    exports com.example.employee;
}
```
#### department/module-info.java:
```
module com.example.department {
    exports com.example.department;
    requires com.example.employee;
}
```
#### mainApp/module-info.java:
```
module com.example.mainApp {
    requires com.example.employee;
    requires com.example.department;
}
```

### Employee Module
The `Employee module` defines the `Employee and Civility classes`, representing individual employees and their civility titles (e.g., Mr., Mrs., etc.).
The module exports the `com.example.employee` package, allowing other modules to access the `Employee` and `Civility` classes.

Employee.java:
```
package com.example.employee;

public class Employee {
    private final Civility civility;
    private final String firstname;
    private final String lastname;
    
    // constructor...
}
```
Civility.java
```
package com.example.employee;

public enum Civility {
    MR("Mister"), MRS("Miss");
    // Constructor...
}
```

### Department Module
The `Department module` defines the `Department class`, representing a company department with a name and a list of employees.
The module exports the `com.example.department` package and requires the `com.example.employee module to access the Employee class.

Department.java
```
package com.example.department;

import com.example.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private final List<Employee> employees;
    
    // Constructor...
}

```

### MainApp Module
The `mainApp module` contains the `Main class`, which serves as the entry point for our application. This module requires both the `com.example.employee` and `com.example.department modules.

Main.java:
```
package com.example.mainApp;

import com.example.department.Department;
import com.example.employee.Civility;
import com.example.employee.Employee;

public class Main {
    public static void main(String[] args) {
        var alice = new Employee(Civility.MRS, "Alice", "Dupont");
        var henry = new Employee(Civility.MR, "Henry", "Tran");

        var department = new Department("IT");
    
    // constructor...
}
```
----

Documentation:
> Oracle: https://www.oracle.com/corporate/features/understanding-java-9-modules.html
>
> OpenJdk: https://openjdk.org/projects/jigsaw/quick-start
