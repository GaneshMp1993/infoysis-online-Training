package com.project.operators;

public class UnaryOperator {//pre increment and post increment operator
	                         //pre decrement and post decrement operator
public static void main(String[] args) {
	

	int i=2;
	int j=i++;//j=2;i=3
/*	i++ is post increment operator
	first the value will assign to the varible 
     and then it should be incremented by 1 */
	int k=++i;//k=4,i=4
	/*++i it is a pre-increment operator
	 * first the value should increments by 1 and then
	 * it should assign to the varibale
	*/
	System.out.println("Value of j is: "+j);
	System.out.println("Value of k is: "+k);
	
}
}