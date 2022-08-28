package com.abcdeveloper.rest;

public class CustomLinkedListData {
     ListNode head;

    public ListNode addData(int data){
        ListNode newNode = new ListNode(data);
        if(this.head == null) {
            head = newNode;
        }else{
            ListNode currNode = head;
            while(currNode.getNext() != null){
                currNode = currNode.getNext();
            }
            currNode.setNext(newNode);
        }
        return head;
    }

    public ListNode deleteData(int data){
        if(head == null) return null;
        if(head.data == data) return head.next;

        ListNode curr = head;
        while(curr.next != null){
            if(curr.next.data == data){
                curr.next = curr.next.next;
                return curr;
            }
        }
        return head;
    }
}
