package com.arrayList;

public class DeleteNode {
    public static void main(String[] args) {
        int val = 0;
       // ListNode listNode = new ListNode(node);
        //deleteNode(listNode);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}

