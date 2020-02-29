package com.inheritancePolymorphism;

//abstract class and abstract method
public abstract class AbstractManager {
    private int id;

    public AbstractManager(int id) {
        this.id = id;
    }

    public abstract void assignGroupToCourse(int groupId, String nameCourse);
}
