package edu.wmich.cs1120.LA6;

public class Node<E> implements INode<E> {

	public E data;
	public INode<E> next;
	
	// Constructor for Node class
	public Node(E data, INode<E> next) {
		setData(data);
		setNext(next);
	} // End of constructor Node

	public E getData() {
		// Return data
		return data;
	} // End of method getData

	public void setData(E data) {
		// Set this.data to data
		this.data = data;
	} // End of methos setData

	public INode<E> getNext() {
		// Return next
		return next;
	} // End of method getNext

	public void setNext(INode<E> next) {
		// Set this.next to next
		this.next = next;
	} // End of method setNext

} // End of class Node
