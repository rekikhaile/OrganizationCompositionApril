package com.rekik.organizationcomposition;

public class Employee {
    private String employeeNr;
    private String firstName;
    private String lastName;

    public Employee() {
    }

    public Employee(String employeeNr, String firstName, String lastName) {
        this.employeeNr=employeeNr;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Employee(String employeeNr, String firstName) {
        this.employeeNr=employeeNr;
        this.firstName=firstName;
    }

    public String getEmployeeNr() {
        return employeeNr;
    }

    public void setEmployeeNr(String employeeNr) {
        this.employeeNr=employeeNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
}
