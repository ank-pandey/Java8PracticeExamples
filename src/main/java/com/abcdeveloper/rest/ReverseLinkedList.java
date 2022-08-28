package com.abcdeveloper.rest;

import lombok.Data;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode1 list = constructLinkedList();
        System.out.println("LinkedList data :: "+ list);
        ListNode1 reverseList =reverseList(list);
        System.out.println("Reversed LinkedList data :: "+ reverseList);
    }

    private static ListNode1 reverseList(ListNode1 head) {
        ListNode1 previous = null;
        ListNode1 current = head;
        while (current != null) {
            ListNode1 nextElement = current.getNext();
            current.setNext(previous);
            previous = current;
            current = nextElement;
        }
        return previous;
    }

    private static ListNode1 constructLinkedList() {
        ListNode1 head = null;
        ListNode1 tail = null;
        for(int i = 1; i<= 5; i++){
            ListNode1 node = new ListNode1(i);
            if(head == null){
                head = node;
            }else{
                tail.setNext(node);
            }
            tail = node;
        }
        return head;
    }
}
@Data
 class ListNode1 {
    private int data;
    private ListNode1 next;
    ListNode1(int data){
        this.data = data;
        this.next = null;
    }
}
