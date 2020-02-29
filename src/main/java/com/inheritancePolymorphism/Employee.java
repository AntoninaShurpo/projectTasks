package com.inheritancePolymorphism;

public class Employee {
    private int id;

    public Employee(int idc) {
        super();
        id = idc;
    }

    public int getId() {
        return id;
    }

    public void typeEmployee() {
        System.out.println("Employee");
    }
}
