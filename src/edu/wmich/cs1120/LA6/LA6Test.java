package edu.wmich.cs1120.LA6;

import java.io.IOException;

public class LA6Test {

	public static void main(String[] args) throws IOException {
		IDecoder decoder = new Decoder();
		System.out.println(">>> Processing expressions from Expression1.dat\n");
		decoder.processExpressions("Expression1.dat");
		decoder.printResults();

		System.out.println(">>> Processing expressions from Expression2.dat\n");
		decoder = new Decoder();
		decoder.processExpressions("Expression2.dat");
		decoder.printResults();

		System.out.println(">>> Processing expressions from Expression3.dat\n");
		decoder = new Decoder();
		decoder.processExpressions("Expression3.dat");
		decoder.printResults();

	} // End of main 

} // End of class LA6Test
