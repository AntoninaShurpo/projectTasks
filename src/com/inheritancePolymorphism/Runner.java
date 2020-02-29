package com.inheritancePolymorphism;

public class Runner {
    public static void main(String[] args) {
        Employee b1 = new Employee(111);
        Employee b2 = new Manager(342, 32);
        b1.typeEmployee(); // ?
        b2.typeEmployee(); // ?
        ((Manager) b2).getIdProject();
        Manager b3 = new Manager(533,22);
        System.out.println(b3.getIdProject()); //22
        System.out.println(b3.getId()); //533

    }
}
