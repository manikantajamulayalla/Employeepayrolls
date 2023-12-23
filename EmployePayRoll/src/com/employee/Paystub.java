package com.employee;

public class Paystub {
    public void displaypaystub(Employee e){
        System.out.println("Employee Id: "+e.getId());
        System.out.println("Employee Name: "+e.getName());
        System.out.println("Employee salary: "+e.getSalary());
        System.out.println("Employee salary deduction: "+e.getDeduction());
        System.out.println("Employee Net salary: "+(e.getSalary()-e.getDeduction()));
        System.out.println("#################################");
        System.out.println();
        System.out.println();
    }
}
