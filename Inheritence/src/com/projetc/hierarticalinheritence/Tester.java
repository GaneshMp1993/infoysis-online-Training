package com.projetc.hierarticalinheritence;

public class Tester {
	public static void main(String[] args) {
		Fruit fruit=new Fruit();
		fruit.sweet();
		fruit.sour();
		System.out.println("*******************8");
		
		Apple apple=new Apple();
		apple.name="Apple";
		apple.color="Red";
		apple.price=120.00;
		apple.DetailsOfFruit();
		apple.sweet();
		apple.goodForHealth();
		System.out.println("*********************");
		Banana banana=new Banana();
		banana.name="Banana";
		banana.color="Yellow";
		banana.price=50.00;
		banana.DetailsOfFruit();
		banana.sweet();
		banana.goodForDigsition();
		System.out.println("**********************");
		Ornage orange=new Ornage();
		orange.name="Orange";
		orange.color="safran";
		orange.price=70.00;
		orange.sour();
		orange.DetailsOfFruit();
		orange.goodForAJuice();
	}

}
