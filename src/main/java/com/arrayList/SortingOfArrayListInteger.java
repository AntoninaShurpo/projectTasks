package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(32);
        arrayList.add(8);
        arrayList.add(10);
        System.out.println("ArrayList before sorting: ");
        for (int container : arrayList) {
            System.out.println(container);
        }

        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting: ");
        for (int container : arrayList) {
            System.out.println(container);
        }


    }
}
