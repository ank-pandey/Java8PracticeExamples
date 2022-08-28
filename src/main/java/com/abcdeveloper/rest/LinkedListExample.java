package com.abcdeveloper.rest;

public class LinkedListExample {
    public static void main(String[] args) {
        CustomLinkedListData ll = new CustomLinkedListData();
        ll.addData(1);
        ll.addData(2);
        ll.addData(3);
        ll.addData(4);
        System.out.println(ll.head);
        ll.deleteData(2);
        System.out.println(ll.head);
    }
}

