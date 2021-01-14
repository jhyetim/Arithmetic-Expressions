package edu.wmich.cs1120.LA6;

public class Stack<E> implements IStack<E> {

	private LinkedList<E> linkedList = new LinkedList<E>();

	public void push(E s) {
		// Call method add
		linkedList.add(s);
	} // End of method push

	public E pop() {
		// Call method remove and return 
		return linkedList.remove(linkedList.size() - 1);
	} // End of method pop

	public E peek() {
		// Call method get and return 
		return linkedList.get(linkedList.size()-1);
	} // End of method peek

	public int size() {
		// Call method size and return
		return linkedList.size();
	} // End of method size

	public boolean isEmpty() {
		// Call method isEmpty and return
		return linkedList.isEmpty();
	} // End of methods isEmpty

} // End of class Stack
