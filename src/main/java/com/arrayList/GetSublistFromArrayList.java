package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class GetSublistFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Steve");
        al.add("Justin");
        al.add("Olga");
        al.add("John");
        al.add("Arnold");
        al.add("Tanya");
        System.out.println("Original Array list: " + al);

        //Sublist to ArrayList
        ArrayList<String> al2 = new ArrayList<>(al.subList(2, 5));
        System.out.println("Sublist of al: " + al2);

        //Sublist to List
        List<String> list = al.subList(1, 4);
        System.out.println("List: " + list);

    }
}
