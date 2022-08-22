package com.project.demo;

public class MethodDemo {
	public void method1() {
		System.out.println("MethodDemo.method1()");
	}

	public void cricket() {
		System.out.println("MethodDemo.cricket()");
	}

	public String hockey() {
		return "Hockey is the natioanl game for india";

	}

	public int additon() {
		int a = 40;
		int b = 60;
		int sum = a + b;
		return sum;
	}

	public String validateAge() {
		int age = 18;
		String validateResult = "You are eligible for voting";
		String validateFalseResult = "you are not eligible";
		if (age > 18) {
			return validateResult;
		} else {
			return validateFalseResult;
		}
	}

	public boolean valiadateMinimumBalance() {
		int amount = 500;
		if (amount > 500) {
			return true;
		} else {
			return false;
		}
	}
}
