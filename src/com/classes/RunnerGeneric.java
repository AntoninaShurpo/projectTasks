package com.classes;

public class RunnerGeneric {
    public static void main(String[] args) {
        //param with Integer
        Optional<Integer> obj1 = new Optional<Integer>();
        obj1.setValue(1);
        int v1 = obj1.getValue();
        System.out.println(v1);
        //param with String
        Optional<String> obj2 = new Optional<String>("Java");
        String v2 = obj2.getValue();
        System.out.println(v2);
        //param by default Object
        Optional obj3 = new Optional();
        System.out.println(obj3.getValue());
        obj3.setValue("Java SE 13");
        System.out.println(obj3.toString());
        obj3.setValue(71);
        System.out.println(obj3.toString());

        obj3.setValue(null);
    }
}
