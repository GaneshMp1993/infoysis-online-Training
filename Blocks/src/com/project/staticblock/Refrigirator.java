package com.project.staticblock;

public class Refrigirator {
	 static String name;
	static String color;
	static String brand;
	static double price;
	static long uniqueId;

	static {
		//this is a block
		//SIB->Static initialization block
		name = "Lg pro";
		color = "Red";
		brand = "LG";
		price = 15000.00;
		uniqueId = 243234;

	}
	static {
		// this ia a block,,
		// SIB->Static initialization block
		name = "Samsung";
		color = "Blue";
		brand = "Samsung";
		price = 18000.00;
		uniqueId = 54343434;
	}

}
