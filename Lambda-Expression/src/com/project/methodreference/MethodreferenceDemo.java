package com.project.methodreference;

public class MethodreferenceDemo {
	public static void main(String[] args) {
		System.out.println("Learning method reference,,,,,,,,,,,,");
		//provide implementation for for workInterface
		WorkInterface inter=()->System.out.println("this is task,,,,,,,,,");
		inter.doTask();
	
		
		
	}

}
