package com.classes;

public class Department {
    {
        System.out.println("logic (1) id= " + this.id );
    }
    static {
        System.out.println("System logic");
    }
    private int id = 7;

    public Department(int d){
        id = d;
        System.out.println("Constructor id " + id);
    }
    int getId(){
        return id;
    }
    {
        id = 10;
        System.out.println("Loogic (2) id= " + id);
    }
}
