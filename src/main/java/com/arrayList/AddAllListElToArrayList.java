package com.arrayList;

import javax.swing.*;
import java.util.ArrayList;

public class AddAllListElToArrayList {
    public static void main (String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Text1.1");
        arrayList1.add("Text1.2");
        arrayList1.add("Text1.3");

        System.out.println("Show first list: " + arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Text2.1");
        arrayList2.add("Text2.2");
        arrayList2.add("Text2.3");

        arrayList1.addAll(arrayList2);
        System.out.println("Updated first list: " + arrayList1);
    }
}
