package com.arrayList;

import java.util.ArrayList;

public class LastOccurrenceOfIndex {
    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(88);
        arrayList.add(9);
        arrayList.add(17);
        arrayList.add(17);
        arrayList.add(9);
        arrayList.add(17);
        arrayList.add(91);
        arrayList.add(27);
        arrayList.add(1);
        arrayList.add(17);

        System.out.println("Last occurrences of element 1 has index: " + arrayList.lastIndexOf(1));
        System.out.println("Array list contains '2' ? " + arrayList.contains(2));
        System.out.println("Get index of '88': " + arrayList.indexOf(88));
        System.out.println("First element of the ArrayList: "+arrayList.get(0));


    }
}
