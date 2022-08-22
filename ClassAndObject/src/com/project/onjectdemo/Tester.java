package com.project.onjectdemo;

public class Tester {
	public static void main(String[] args) {
		// creating the object for car class,,,,,,,,,
		Car car = new Car();// new keyword is creates object for us,,,,,,
		// initialization for an object
		car.slNo = 142;
		car.name = "Punch";
		car.color = "white";
		car.brand = "Tata";
		car.haveAirProvided = true;
		// calling methods
		car.canTravel();
		car.carryLaguage();
		car.listenMusic();
		//and you need to implement the same thing by using nested if statmenet
		if(car.slNo>0) {
			System.out.println("Sl No: "+car.slNo);
		}
		else {
			System.out.println("Sl no is invalid,,,,,,,,,,,,");
		}
		if(car.name!=null && !car.name.isEmpty()) {
			System.out.println("Name: "+car.name);
			
		}
		else {
			System.out.println("Name is Invlaid,,,,,,,,,,,");
		}
		// printing the values
//		System.out.println("Car SlNo: " + car.slNo);
//		System.out.println("Name: " + car.name);
//		System.out.println("Color: " + car.color);
//		System.out.println("Brand: " + car.brand);
//		System.out.println("Cantact Number: " + Car.cantactNumber);
//		System.out.println("Is Air Bag Provided?" + car.haveAirProvided);
//		System.out.println("***********************************");
		// creating another object for Car class,,,,,,,,,
//		Car car1 = new Car();
//		car1.slNo = 143;
//		car1.name = "Nexon";
//		car1.color = "Blue";
//		car1.brand = "Tata";
//		car1.haveAirProvided = true;
//		car1.canTravel();
//		car1.carryLaguage();
//		car1.listenMusic();
//		// printing the values
//		System.out.println("Car SlNo: " + car1.slNo);
//		System.out.println("Name: " + car1.name);
//		System.out.println("Color: " + car1.color);
//		System.out.println("Brand: " + car1.brand);
//		System.out.println("Cantact Number: " + Car.cantactNumber);
//		System.out.println("Is Air Bag Provided?" + car1.haveAirProvided);
	}
}
