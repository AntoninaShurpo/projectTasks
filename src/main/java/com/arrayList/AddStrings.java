package com.arrayList;

import java.util.ArrayList;

public class AddStrings {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Renault");
        cars.add("Mazda");
        for (int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));

        }
    }
}
