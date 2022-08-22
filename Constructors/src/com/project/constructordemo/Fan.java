package com.project.constructordemo;

public class Fan {
	int noOfWings;
	String campany;
	double price;
	int rpm;
	String color;

	public Fan() {

	}

	public Fan(int noOfWings) {

		this.noOfWings = noOfWings;
	}

	public Fan(int noOfWings, String campany) {

		this.noOfWings = noOfWings;
		this.campany = campany;
	}

	public Fan(int noOfWings, String campany, double price) {

		this.noOfWings = noOfWings;
		this.campany = campany;
		this.price = price;
	}

	public Fan(int noOfWings, String campany, double price, int rpm) {

		this.noOfWings = noOfWings;
		this.campany = campany;
		this.price = price;
		this.rpm = rpm;
	}

	public Fan(int noOfWings, String campany, double price, int rpm, String color) {

		this.noOfWings = noOfWings;
		this.campany = campany;
		this.price = price;
		this.rpm = rpm;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fan [noOfWings=" + noOfWings + ", campany=" + campany + ", price=" + price + ", rpm=" + rpm + ", color="
				+ color + "]";
	}

	public void cool() {
		System.out.println("Involked Cool () from Fan class,,,,,,,,,,");
	}

}
