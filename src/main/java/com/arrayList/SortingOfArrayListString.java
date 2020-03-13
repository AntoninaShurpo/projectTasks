package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfArrayListString {
    public static void main(String[] args) {
        ArrayList<String> listOfCountries = new ArrayList<>();
        listOfCountries.add("Belarus");
        listOfCountries.add("USA");
        listOfCountries.add("Russia");
        listOfCountries.add("Ukraine");

        System.out.println("Before sorting: ");
        for (String counter : listOfCountries) {
            System.out.println(counter);
        }

        Collections.sort(listOfCountries);

        System.out.println("\nAfter sorting: ");
        for (String counter : listOfCountries) {
            System.out.println(counter);
        }
    }

}
