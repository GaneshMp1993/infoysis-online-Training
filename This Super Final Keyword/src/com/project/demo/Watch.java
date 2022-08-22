package com.project.demo;

public class Watch {
	String name;
	String color;
	double price;

	public Watch() {

	}
	
	public Watch(String name, String color) {
		
		this.name = name;
		this.color = color;
	}
	

	public Watch(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public void display() {
		System.out.println("Name: "+name+" Color:"+color+" Price: "+price);
	}

	@Override
	public String toString() {
		return "Watch [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	

}
