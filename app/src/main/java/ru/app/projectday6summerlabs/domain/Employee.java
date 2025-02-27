package ru.app.projectday6summerlabs.domain;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void raiseSalary(double increase) {
        if (increase > 0) {
            salary += increase;
        }
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
