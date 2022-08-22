package com.project.lamdbademo1;

public class App {
	public static void main(String[] args) {
		//for single line
		Lambda lambda=()->System.out.println("Demo,,,,,,,,,,,,,,,,,");
	lambda.demo();
	//for multiple lines
	Lambda lambda1=()->{
		System.out.println("Hii,,,,,,,,,,");
		System.out.println("Helo,,,,,,,,,,,,,,,,,,,");
	};
	lambda1.demo();
	}

}
