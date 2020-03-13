package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfArrayListDesc {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("CC");
        arrayList.add("BC");
        arrayList.add("BA");
        arrayList.add("FF");

        System.out.println("Before sorting");
        for (String counteiner : arrayList) {
            System.out.println(counteiner);
        }

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("After desc sorting: ");
        for (String container : arrayList) {
            System.out.println(container);
        }
    }
}
