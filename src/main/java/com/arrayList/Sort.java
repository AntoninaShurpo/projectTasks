package com.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Renault");
        cars.add("Mazda");
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
