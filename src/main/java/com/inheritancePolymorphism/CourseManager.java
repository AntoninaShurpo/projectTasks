package com.inheritancePolymorphism;

//subclass of abstract class
public class CourseManager extends AbstractManager {
    private int id;

    public CourseManager(int id) {
        super(id);
    }

    public void assignGroupToCourse(int groupIid, String namCourse) {

        System.out.println("Group " + groupIid + " assigned to course " + namCourse);
    }
}

