package com.example.employee;

public class Employee {
    private final Civility civility;
    private final String firstname;
    private final String lastname;

    public Employee(Civility civility, String firstname, String lastname) {
        this.civility = civility;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String fullName(){
        return new StringBuilder(civility.name())
                .append(" ")
                .append(firstname)
                .append(" ")
                .append(lastname)
                .toString();
    }
}
