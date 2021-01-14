package edu.wmich.cs1120.LA6;

public class PostfixExpression implements IPostfixExpression {

	IStack<Integer> stack;
	String expression;
	int result;

	public int calculateResult() {
		// Return result
		return result;
	} // End of method calculateResult

	public String getPostfixExpression() {
		// Return expression
		return expression;
	} // End of method getPostfixExpression

	public void setPostfixExpression(String expression) {
		// Set this.expression to expression
		this.expression = expression;
		// initialize stack object
		stack = new Stack<Integer>();
		// call setStack method
		setStack(stack);
	} // End of method setPostfixExpression

	public void setStack(IStack<Integer> stack) {

		// use a field variable for splitting the expression
		String[] field = new String[20];
		field = (expression.split(","));

		// use a for loop to loop through the expression
		for (int i = 0; i < field.length; i++) {
			// check if character is a digit
			if (Character.isDigit(field[i].charAt(0))) {
				// if it is a digit, push it to the stack, sending in the integer
				stack.push(Integer.parseInt(field[i]));
				// if not, call the pop method on the stack to get the two integers that were
				// last added
			} else {
				int num1 = stack.pop();
				int num2 = stack.pop();

				// check for the operator
				char operator = field[i].charAt(0);
				// if operator is a '+', push the sum of the two values into the stack
				if (operator == '+') {
					stack.push(num2 + num1);
				}
				// if operator is a '-', calculate the result of second-popped value minus the
				// other value,
				// push it into the stack
				if (operator == '-') {
					stack.push(num2 - num1);
				}
				// if operator is a '*', push the product of the values into the stack
				if (operator == '*') {
					stack.push(num2 * num1);
				}
				// if operator is a '/', calculate the result of second-popped value dividing
				// the other value,
				// push it into the stack
				if (operator == '/') {
					stack.push(num2 / num1);
				}
			}
			// set the value of the result using peek method
			result = stack.peek();

		}

	} // End of method setStack

} // End of class PostfixExpression
