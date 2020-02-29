package com.inheritancePolymorphism;

public class RunnerBase {
    public static void main(String[] args) {
        Base obj1 = new Base();
        Base obj2 = new Sub();
        Sub obj3 = new Sub();
        obj1.assign(); //invalid call
        obj2.assign(); //should be Base.assign()
        obj3.assign();
    }
}
