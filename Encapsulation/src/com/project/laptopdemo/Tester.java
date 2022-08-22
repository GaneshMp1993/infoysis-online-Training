package com.project.laptopdemo;

public class Tester {
public static void main(String[] args) {
	Laptop laptop=new Laptop();
	laptop.setName("HP");
	laptop.setBrand("HP");
	laptop.setColor("White");
	laptop.setPrice(35000.00);
	
	System.out.println(laptop.getName());
	System.out.println(laptop.getBrand());
	System.out.println(laptop.getColor());
	System.out.println(laptop.getPrice());
}
}
