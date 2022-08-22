package com.project.localvariable;

public class LocalVariableDemo {
	//which are declrered inside the method,,outside the class
	//scope is inside the method itself only,,,,,,,,,,,
	public void addition() {
		int a=30;
		int b=50;
		int sum=a+b;
		System.out.println("Addition of two numbers is: "+sum);
	}
	public void substraction() {
		int a=50;
		int b=20;
		int sub=a-b;
		System.out.println("Substraction of two numbers: "+sub);
	}
	public void multiplication() {
		int a=50;
		int b=20;
		int mul=a*b;
		System.out.println("Substraction of two numbers: "+mul);	
	}
	public void division() {
		int a=50;
		int b=20;
		int div=a/b;
		System.out.println("Substraction of two numbers: "+div);
	}

}
