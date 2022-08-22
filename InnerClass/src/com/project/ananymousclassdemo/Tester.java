package com.project.ananymousclassdemo;

public class Tester {
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle() {
			
			@Override
			public void wheels() {
				System.out.println("Involked wheels()");
				System.out.println("2 wheels for bike");
				System.out.println("3 wheels for auto");
				System.out.println("4 wheels for car");
			}

			@Override
			public void ride() {
				System.out.println("Involked ride method,,,,,,,,,,,,");
				System.out.println("Using vehicles,,,,,,,we can ride safely,,,,,,,,");
			}
		};
		vehicle.wheels();
		vehicle.ride();
	}

}
