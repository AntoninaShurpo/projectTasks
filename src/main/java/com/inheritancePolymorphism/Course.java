package com.inheritancePolymorphism;

public class Course {
    public int id;
     public Course() {
         System.out.println("Constructor of Course class");
         id = getId(); // !
         System.out.println(" id= " + id);
     }
     public int getId(){
         System.out.println("getId () of Course class");
         return id;
     }
}
