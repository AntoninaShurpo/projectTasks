package com.inheritancePolymorphism;

public class RunnerAbstract {
    public static void main(String[] args) {
        AbstractManager mng; // allows to declare link, but not an object
        mng = new CourseManager(1);
        mng.assignGroupToCourse(10, "Algebra");

    }
}
