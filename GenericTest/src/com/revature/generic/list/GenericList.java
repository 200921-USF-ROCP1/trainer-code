package com.revature.generic.list;

public class GenericList<T> {

	Node head;
	int size = 0;
	
	public T get(int index) {
		Node node = head;
		
		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException();
		
		for (int i = 0; i < index; ++i) {
			node = node.next;
		}
		
		return node.data;
	}
	
	public void insertFront(T t) {
		Node oldHead = head;
		head = new Node(null, oldHead, t);
		
		if (size > 0)
			oldHead.previous = head;
		
		++size;
	}
	
	public void insert(T t, int index) {
		if (size == 0) {
			insertFront(t);
			return;
		}
		
		Node pointer = head;
		
		if (index >= size || index < 0)
			throw new IndexOutOfBoundsException();
		
		for (int i = 0; i < index; ++i) {
			pointer = pointer.next;
		}
		
		Node newNode = new Node(pointer, pointer.next, t);
		pointer.next = newNode;
		
		if (index + 1 < size)
			pointer.next.previous = newNode;
		
		++size;
	}
	
	public void insertEnd(T t) {
		if (size == 0) {
			insertFront(t);
			return;
		}
		
		Node pointer = head;
		
		for (int i = 0; i < size - 1; ++i) {
			pointer = pointer.next;
		}
		
		Node last = new Node(pointer, null, t);
		pointer.next = last;
		
		++size;
	}
	
	public void delete(T t) {
		Node node = head;
		for (int i = 0; i < size; ++i) {
			if (node.data.equals(t)) {
				
				if (i > 0)
					node.previous.next = node.next;
				
				if (i + 1 < size)
					node.next.previous = node.previous;
				
				--size;
				return;
			}
			
			node = node.next;
		}
	}
	
	public Iterator getIterator() {
		return new Iterator();
	}
	
	class Node {
		private Node previous, next;
		private T data;
		
		Node(Node previous, Node next, T data) {
			this.previous = previous;
			this.next = next;
			this.data = data;
		}
	}
	
	public class Iterator {
		private Node current;
		
		public Iterator() {
			current = head;
		}
		
		public T getData() {
			return current.data;
		}
		
		public boolean hasNext() {
			return current != null;
		}
		
		public void next() {
			current = current.next;
		}
	}
}
