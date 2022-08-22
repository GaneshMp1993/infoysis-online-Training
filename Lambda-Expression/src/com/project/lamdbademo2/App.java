package com.project.lamdbademo2;

public class App {
	public static void main(String[] args) {
		Lambda lambda=()->10;
		System.out.println(lambda.demo());
		
		Lambda lambda1=()->((10*25)/3);
		System.out.println(lambda1.demo());
	}

}
