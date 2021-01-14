package edu.wmich.cs1120.LA6;

public class LinkedList<E> implements ILinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	// Constructor for LinkedList
	public LinkedList() {
		// Initialize head and tail to null, and size to 0
		head = null;
		tail = null;
		size = 0;
	} // End of constructor LinkedList 

	public void add(Object e) {
		// If the list is empty
		if (size == 0) {
			Node<E> newNode = new Node(e, null);
			head = newNode;
			tail = head;
		}
		// If the list is not empty
		else {
			Node<E> newNode = new Node(e, null);
			tail.next = newNode;
			tail = newNode;
		}

		// Increment size
		size++;

	} // End of method add

	public void clear() {
		// Set head to null and size to 0
		head = null;
		size = 0;
	} // End of method clear

	public E getTail() {
		// Return tail
		return (E) tail;
	} // End of method clear

	public E get(int index) throws IndexOutOfBoundsException {
		// If index is less than 0 or more than size, then throw
		// IndexOutOfBoundsException
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}

		Node<E> node = head;

		for (int i = 0; i < index; i++) {
			node = (Node<E>) node.next;
		}

		// Return node.getData()
		return node.getData();
	} // End of method get

	public boolean isEmpty() {
		// If size is equals to 0 return true, else return false
		if (size == 0) {
			return true;
		} else {
			return false;
		}

	} // End of method isEmpty

	public E remove(int index) throws IndexOutOfBoundsException {

		// If index is less than 0 and more than size, throw IndexOutOfBoundsException
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		// If index is 0, then remove first element
		else if (index == 0) {
			E removed = head.data;
			head = (Node<E>) head.next;

			// Decrement size
			size--;

			// Return removed
			return removed;

		}
		// If index is not out of bounds and not 0
		else {
			// position beforeI before the node to remove
			Node<E> beforeI = head;
			for (int i = 1; i < index; i++) {
				beforeI = (Node<E>) beforeI.next;
			}

			// position afterI after the node to remove
			Node<E> afterI = (Node<E>) beforeI.next.getNext();

			// remember old data
			E removed = beforeI.next.getData();

			// link beforeI to afterI
			beforeI.next = afterI;

			// If afterI is null
			if (afterI == null) {
				// removed last element, so update tail
				tail = beforeI;
			}

			// Decrement size
			size--;

			// Return removed
			return removed;
		}
	} // End of method remove

	public int size() {
		// Return size
		return size;
	} // End of method size

} // End of class LinkedList
