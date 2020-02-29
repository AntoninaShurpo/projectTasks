package com.arrayList;

import java.util.LinkedList;

public class ListOverview {
    public static void main(String[] args) {
        LinkedList<String> object = new LinkedList<String>();
        object.add("A");
        object.add("B");
        object.addFirst("C");
        object.addLast("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");
        System.out.println("Given Linked list: " + object);

        object.remove("B");
        object.remove(3);
        object.removeFirst();
        object.removeLast();
        System.out.println("Linked list after deletion: " + object);

        boolean status = object.contains("F");
        if (status)
            System.out.println("List contains the element 'F' ");
        else
            System.out.println("List does not contain the element 'F' ");

        int size = object.size();
        System.out.println("Size of linked list = " + size);

        Object element = object.get(2);
        System.out.println("Element returned by get() : " + element);
        object.set(2, "Y");
        System.out.println("Linked list after change : " + object);

    }

}
