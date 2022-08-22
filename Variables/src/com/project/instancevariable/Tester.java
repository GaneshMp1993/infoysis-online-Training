package com.project.instancevariable;

public class Tester {
public static void main(String[] args) {
	InstanceVariableDemo demo=new InstanceVariableDemo();
	//instance variables can access through object reference only,,,,,,,,,,
	demo.a=100;
	demo.b=50;
	demo.addition=demo.a+demo.b;
	demo.substraction=demo.a-demo.b;
	demo.multiplication=demo.a*demo.b;
	demo.division=demo.a/demo.b;
	
	System.out.println("Addition of two Numbers: "+demo.addition);
	System.out.println("Substraction of two numbers: "+demo.substraction);
	System.out.println("Multiplication of two numbers: "+demo.multiplication);
	System.out.println("Division of two numners: "+demo.division);
	
}
}
