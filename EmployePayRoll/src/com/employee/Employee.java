package com.employee;

public class Employee {
    private int Id;
    private String name;
    private double salary;
    private double deduction;

    public Employee(int id,String name,double salary,double deduction) {
        Id = id;
        this.name=name;
        this.salary=salary;
        this.deduction=deduction;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
}
