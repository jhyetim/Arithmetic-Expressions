package edu.wmich.cs1120.LA6;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Decoder implements IDecoder {

	private String expression1;
	private String expression2;
	private PostfixExpression postfixExpression1;
	private PostfixExpression postfixExpression2;
	private ArrayList<IPostfixExpression> expressions;

	public void setPostfixExpressions(ArrayList<IPostfixExpression> expressions) {
		// TODO Auto-generated method stub
		// initialize new ArrayList of expressions so it can be used in any methods of
		// this class
		this.expressions = new ArrayList<IPostfixExpression>();
		// add the two expressions into the ArrayList
		this.expressions.add(postfixExpression1);
		this.expressions.add(postfixExpression2);

	} // End of method setPostfixExpressions

	@Override
	public void processExpressions(String fileName) throws IOException {
		// TODO Auto-generated method stub
		// read the random access file
		RandomAccessFile random = new RandomAccessFile(fileName, "r");

		// use a character variable for reading characters
		char character1;
		// set expression to an empty string
		expression1 = "";
		// use an integer variable to read the next location, initialize to 0
		int nextLocation = 0;

		// loop as long as the next location is not -1000 or -1
		while (nextLocation != -1000 || nextLocation != -1) {
			// seek using the nextLocation
			random.seek(nextLocation);
			// read the character
			character1 = random.readChar();
			// add the character into the expression
			expression1 = expression1 + character1;
			// read the next location
			nextLocation = random.readInt();

			// if the next location is -1000 or -1, end the loop
			if (nextLocation == -1000 || nextLocation == -1) {
				break;
			}
		}

		// for the next expression of the same file
		// use a character variable for reading characters
		char character2;
		// set expression to an empty string
		expression2 = "";
		// add the first character read into the expression
		expression2 = expression2 + random.readChar();
		// use an integer variable to read the next location, initialize to 0
		int nextLocation2 = random.readInt();

		// loop as long as the next location is not -1000 or -1
		while (nextLocation2 != -1000 || nextLocation2 != -1) {
			// seek using the nextLocation
			random.seek(nextLocation2);
			// read the character
			character2 = random.readChar();
			// add the character into the expression
			expression2 = expression2 + character2;
			// read the next location
			nextLocation2 = random.readInt();

			// if the next location is -1000 or -1, end the loop
			if (nextLocation2 == -1000 || nextLocation2 == -1) {
				break;
			}

		}

		// create 2 PostfixExpression objects
		// for each, call setPostfixExpression method sending in one of the expressions
		postfixExpression1 = new PostfixExpression();
		postfixExpression1.setPostfixExpression(expression1);
		postfixExpression2 = new PostfixExpression();
		postfixExpression2.setPostfixExpression(expression2);

		// call the setPostfixExpression method in this class
		ArrayList<IPostfixExpression> expressionArray = new ArrayList<IPostfixExpression>();
		setPostfixExpressions(expressionArray);
	} // End of method processExpressions

	public void printResults() {
		// print the results
		System.out.printf("Number of Expressions: %d\n", expressions.size());
		System.out.println("----------------------------");
		System.out.printf("Expression 1: " + expressions.get(0).getPostfixExpression() + "\n");
		System.out.printf("Result: " + expressions.get(0).calculateResult() + "\n\n");
		System.out.printf("Expression 2: " + expressions.get(1).getPostfixExpression() + "\n");
		System.out.printf("Result: " + expressions.get(1).calculateResult() + "\n\n");
	} // End of method printResults

} // End of class Decoder
