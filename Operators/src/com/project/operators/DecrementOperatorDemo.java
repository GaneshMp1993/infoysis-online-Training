package com.project.operators;

public class DecrementOperatorDemo {
public static void main(String[] args) {
	int i=2;
	int j=i--;//j=2;i=1
	/*i-- it is a pre decrement operator
	 * first it will assign to the variable and the the value will be decreased by 1
	 * 
	 * --i it is a pre decrement operator
	 * first the value will be decremented by 1 and then it should assin to the variable
	 * 	 */
	int k=--i;//i=1,k=0
	
	System.out.println("The value of j is: "+j);
	System.out.println("The value of K is: "+k);
}
}
