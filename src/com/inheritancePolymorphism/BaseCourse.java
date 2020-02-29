package com.inheritancePolymorphism;

public class BaseCourse extends Course {
    public int id = 90; // ?

    public BaseCourse() {
        System.out.println("Constructor of BaseCourse class");
        System.out.println(" id= " + getId());
    }

    public int getId() {
        System.out.println(" getId() of BaseCourse class");
        return id;

    }
}
