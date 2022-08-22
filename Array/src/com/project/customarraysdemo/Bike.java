package com.project.customarraysdemo;

public class Bike {
	String name;
	String color;
	double price;
	int cc;
	int milage;
	int noOfGears;
	boolean isHeadLightProvided;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String name, String color, double price, int cc, int milage, int noOfGears,
			boolean isHeadLightProvided) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.cc = cc;
		this.milage = milage;
		this.noOfGears = noOfGears;
		this.isHeadLightProvided = isHeadLightProvided;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", color=" + color + ", price=" + price + ", cc=" + cc + ", milage=" + milage
				+ ", noOfGears=" + noOfGears + ", isHeadLightProvided=" + isHeadLightProvided + "]";
	}
	
	

}
