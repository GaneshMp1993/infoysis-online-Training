package com.project.compositiondemo;

public class Tester {
	public static void main(String[] args) {
		Bird bird=new Bird();
		bird.name="Parrot";
		bird.color="Green";
		bird.weight="1.6KG";
		bird.years=3;
		bird.foodHabits="Seeds,fruits";
		
		Wing wing=new Wing();
		wing.color="Red,Green";
		wing.shape="Passive soaring,active soaring";
		wing.size="3.4 Meters";
		wing.bird=bird;
		System.out.println("Details of Wings");
		System.out.println(wing.color);
		System.out.println(wing.shape);
		System.out.println(wing.size);
		wing.fly();
		System.out.println("***********************8");
		System.out.println("Details of Bird");
		System.out.println(wing.bird.name);
		System.out.println(wing.bird.color);
		System.out.println(wing.bird.foodHabits);
		System.out.println(wing.bird.years);
		System.out.println(wing.bird.weight);
		wing.bird.fly();
	}

}
