package com.arrayList;

import java.util.LinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.addFirst("A");
        System.out.println("Given Linked list: " + list);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

