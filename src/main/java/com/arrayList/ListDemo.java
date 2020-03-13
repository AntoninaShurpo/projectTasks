package com.arrayList;

import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> userAgeList = new LinkedList<>();

        userAgeList.add(40);
        userAgeList.add(53);
        userAgeList.add(45);
        userAgeList.add(51);
        userAgeList.add(2, 51);

        System.out.println("First element(head): " + userAgeList.poll());

        System.out.println("Print elements after removing first element: ");
        for (int i = 0; i < userAgeList.size(); i++) {
            System.out.print(userAgeList.get(i) + " ");
        }

        System.out.println( "\nResult after peek: " + userAgeList.peek()); // null if list is empty
        for (int i = 0; i < userAgeList.size(); i++) {
            System.out.print(userAgeList.get(i) + " ");
        }

        System.out.println("\nGet first element: " + userAgeList.getFirst()); //NoSuchElementException if list is empty

        System.out.println("\nGet last element: " + userAgeList.getLast()); //NoSuchElementException if list is empty


        // System.out.println(userAgeList.toArray());

       /* System.out.println("Size of list: "+userAgeList.size());
        userAgeList.remove(3);
        System.out.println("List contains age=12? " + userAgeList.contains(12));
        System.out.println("What are the index of age=12? " + userAgeList.indexOf(12));
        System.out.println("Get element at index=2: "+ userAgeList.get(2));

        Integer[] userAgeArray = userAgeList.toArray(new Integer[0]);
        System.out.println("All elements of List: "+ userAgeList);*/
    }
}
