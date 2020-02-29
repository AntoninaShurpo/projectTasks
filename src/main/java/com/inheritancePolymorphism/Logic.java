package com.inheritancePolymorphism;

public class Logic {
    public static void main(String[] args) {
        Course objA = new BaseCourse();
        BaseCourse objB = new BaseCourse();
        System.out.println(" objA: id=" + objA.id);
        System.out.println(" objB: id=" + objB.id);
        Course objC = new Course();
    }
}
