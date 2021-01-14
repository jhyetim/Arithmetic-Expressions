package edu.wmich.cs1120.LA6;

public interface IStack<E> {
	/**
	 * Adds the parameter s to the top of the stack.
	 * 
	 * @param s the element to be added
	 */
	void push(E s);

	/**
	 * Removes the top element from the stack
	 * 
	 * @return The removed element on the stack
	 */
	E pop();

	/**
	 * Returns the top element without removing it.
	 * 
	 * @return The top element on the stack
	 */
	E peek();

	/**
	 * 
	 * @return The number of elements on the stack
	 */
	int size();

	/**
	 * 
	 * @return True if the stack contains no elements; false otherwise.
	 */
	boolean isEmpty();

} // End of interface IStack
