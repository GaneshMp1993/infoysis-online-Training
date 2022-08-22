package com.project.exceptiondemo;

public class Demo {
	public static void main(String[] args) {
		// exception is an event that disturbs the normal flow of execution,,,,,,
		// try and catch,throws and throw
	
		try {
		int i = 4 / 2;
			System.out.println(i);

		} catch (ArithmeticException e) {
			System.out.println("Invalid input,,,,please give proper input,,,,,,,,,,");
			System.out.println(e.getMessage());
		}
		float f = 15 / 2;
		System.out.println("fgddsfdfsdf");
		System.out.println("Next line,,,,,,,,");
		System.out.println("Next line,,,,,,,,,,,,,,");
		System.out.println(f);
	}

}
