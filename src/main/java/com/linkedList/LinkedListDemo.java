package com.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> object = new LinkedList<>();
        object.add("B");
        object.add("C");
        object.add("D");
        object.addFirst("A");
        object.addLast("E");
        object.add("F");
        object.add("G");
        System.out.println("Given: " + object);

        object.remove("B");
        object.remove(3);
        object.removeFirst();
        object.removeLast();
        System.out.println("Linked list after deletion " + object);

        boolean status = object.contains("E");

        if (status) {
            System.out.println("List contains 'E");
        } else {
            System.out.println("List does not contain 'E");
        }

        Object element = object.get(2);
        System.out.println("Element returned by get() : " + element);
        object.set(2, "Y");
        System.out.println("Linked list after changing : " + object);

    }
}
