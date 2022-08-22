package com.project.demo1;

public class Tester {
	public static void main(String[] args) {
		Mobile mobile=new Mobile(1, "Sony", "japan");
		Mobile mobile2=new Mobile(1, "Sony", "japan");
//		Mobile mobile3=new Mobile(3, "Nokia", "India");
		
//		System.out.println(mobile==mobile2);
		System.out.println(mobile.equals(mobile2));
		System.out.println(mobile.hashCode());
		System.out.println(mobile2.hashCode());
	}

}
