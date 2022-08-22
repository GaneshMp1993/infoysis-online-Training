package com.project.demo;

public class Tester {
	public static void main(String[] args) {
		Watch watch=new Watch("Fasttrack", "Black");
		System.out.println(watch);
		Watch watch1=new Watch("Titan", "Blue", 2500);
		System.out.println(watch1);
		watch1.display();
		System.out.println("**********************************");
		SmartWatch smartWatch=new SmartWatch("Firebolt", "White");
		System.out.println(smartWatch);
		SmartWatch smartwatch1=new SmartWatch("Skimi", "Block", 800);
		System.out.println(smartwatch1);
		smartWatch.displayWatch();
		System.out.println("*****************8");
		smartwatch1.displayWatch();
	}

}
