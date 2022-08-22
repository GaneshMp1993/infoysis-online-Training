package com.project.compiletime;
//method overloading
public class Demo {
	//no of parameters
	public void addition(int a,int b) {
		int sum=a+b;
		System.out.println("Addition of two numbers: "+sum);
	}
	public void addition(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Addition of three Numbers: "+sum);
	}

}
