# Arithmetic-Expressions

This program will read data from three random access binary files and will reconstruct the corresponding postfix expressions based on what was read from the input file.\
These two steps will be referred to as “decoding” in this project. After decoding, your application should evaluate the results of the expressions using a stack and display the result. 

## Guidelines:
1. The postfix expressions are in the following format and the “comma” is used as delimiter.
```
21,5,+,3,14,5,+,*,+ (which is equal to the infix expression (21+5)+3*(14+5) = 83)
```
2. Each of the three binary files contains two postfix expressions. The expressions are made up of characters (chars) including commas. The numbers are stored as chars too; for example, 21 would be stored as two chars: ‘2’ and ‘1’.\
3. The characters are stored in the binary files at random locations.\
4. Each character is followed by an integer, which is the location index of the next character.\
5. The first two bytes in each binary file represent the first character of a postfix expression. Then the following 4 bytes represent the location index of the next character.\
6. -1 indicates the end of the current expression. The byte following “-1” is the beginning of the
next expression.\
7. -1000 indicates the end of the last expression (since there is more than one expression in each
file).

## Example Output:
```
>>> Processing expressions from Expression1.dat
Number of Expressions: 2
----------------------------
Expression 1: 21,5,+,3,14,5,+,*,+
Result: 83
Expression 2: 28,32,54,80,/,+,*
Result: 924

>>> Processing expressions from Expression2.dat
Number of Expressions: 2
----------------------------
Expression 1: 61,15,-,31,114,5,-,*,+
Result: -3425
Expression 2: 16,23,2,1,+,-,*
Result: -320

>>> Processing expressions from Expression3.dat
Number of Expressions: 2
----------------------------
Expression 1: 6,5,+,1,14,5,-,*,-
Result: -20
Expression 2: 1,213,24,17,+,-,*
Result: -172
```
