package com.project.staticvariable;

public class StaticVariableDemo {
	//which are declread inside the class but outside the method using static keyword
	//if we want to share same data for all objects,,then we use static
	//we must initalised values at the class level only,,,,,,,,,,,
	static int a = 150;
	static int b = 120;
	static int addition=a+b;
	static int substraction=a-b;
	static int multiplication=a*b;
	static int division=a/b;
//	static int addtion = StaticVariableDemo.a + StaticVariableDemo.b;
//	static int substraction = StaticVariableDemo.a - StaticVariableDemo.b;
//	static int multiplication = StaticVariableDemo.a * StaticVariableDemo.b;
//	static int division = StaticVariableDemo.a / StaticVariableDemo.b;
}
