package com.arrayList;

import java.util.ArrayList;

public class CompareTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("hi");
        al1.add("How are you");
        al1.add("Good Morning");
        al1.add("bye");
        al1.add("Good night");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Howdy");
        al2.add("Good Evening");
        al2.add("bye");
        al2.add("Good night");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> al3 = new ArrayList<>();
        for (String container: al1){
            al3.add(al2.contains("Good night") ? "Yes" : "No");
        }
        System.out.println(al3);
    }
}
