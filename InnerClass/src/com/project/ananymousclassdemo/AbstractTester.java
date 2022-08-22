package com.project.ananymousclassdemo;

public class AbstractTester {
	public static void main(String[] args) {
		Laptop laptop=new Laptop() {
			//ananymous class---->nameless class,,,,,,,,,,,
			
			@Override
			void speed() {
				System.out.println("Involked speed() in by using anaymous class");
				
			}
			
			@Override
			void price() {
				System.out.println("Involked Price() by using anaymous class");
				
			}
		};
		laptop.speed();
		laptop.price();
		System.out.println(laptop.hashCode());
	}

}
