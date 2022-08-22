package com.project.demo;

public class SmartWatch extends Watch {
	public SmartWatch(String name,String color,double price) {
		super(name, color, price);//it will codes,,,,,
	}
	public SmartWatch(String name,String color) {
		super(name, color);
	}
	public void displayWatch() {
		this.display();
	}

}
