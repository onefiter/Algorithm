package com.onefiter;



public class LinkedList<E> {
	private int size;
	private Node<E>  first;
	
	private static class Node {
		E element;
		Node<E> next;
		public Node(E element, Node<E> next) {
		
			this.element = element;
			this.next = next;
		}
		
	}
}
