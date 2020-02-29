package com.inheritancePolymorphism;

public class BaseCourseHelper extends CourseHelper {
    public BaseCourse getCourse() {
        System.out.println("BaseCourse ");
        return new BaseCourse();

    }

}
