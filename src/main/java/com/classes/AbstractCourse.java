package com.classes;

public abstract class AbstractCourse {
    private String name;

    public AbstractCourse() {
    }

    public abstract void changeTeacher(int id);

    public void setName(String n) {
        name = n;
    }
}
