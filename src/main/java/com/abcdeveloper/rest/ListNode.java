package com.abcdeveloper.rest;


public class ListNode {
    int data;
    ListNode next;
    
    public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	ListNode(int data){
        this.data = data;
        this.next = null;
    }
}
