package com.classes;

enum Faculty {
    MATH, BIO, LANG
}

public class SimpleUseEnum {
    public static void main(String[] args) {
        Faculty current;
        current = Faculty.MATH;
        switch (current) {
            case MATH:
                System.out.println(current);
                break;
            case BIO:
                System.out.println(current);
                break;
            default:
                System.out.println("out of case " + current);
        }
    }
}
