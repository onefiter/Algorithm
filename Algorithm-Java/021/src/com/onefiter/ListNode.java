package com.onefiter;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class ListNode {
	public int val;
	public ListNode next;
	
	public  ListNode(int val) {
		this.val = val;
	}
	
	public ListNode append1(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			return newNode;
		}
		
		ListNode node = head;
		while(node.next != null){
			node = node.next;
		}
		
		node.next = newNode;
		return head;
		
	}
	
	public ListNode append(ListNode head, int value) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		ListNode newNode = new ListNode(value);
		ListNode node = dummy;
		while(node.next != null){
			node = node.next;
		}
		
		node.next = newNode;
		return head;
		
	}
	
	public ListNode delete(ListNode head, int value) {
		
		if (head == null) {
			return head;
		}
		
		if (head.val == value) {
			return head.next;
		}
		
		ListNode node = head;
		while (node.next != null) {
			if (node.next.val == value ) {
				node.next = node.next.next;
				break;	
			}
	
			node = node.next;
		}
		return head;
	}
	
}
