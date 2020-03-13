package com.weatherStation;

import java.util.HashMap;

public class HashMapOtherTypes {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John Lock", 50);
        people.put("James", 40);
        people.put("Kate", 31);
        people.put("Jack", 35);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + ", value: " + people.get(i));
        }
    }
}
