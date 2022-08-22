package com.projetc.singleandmultilevelinheritence;
//child class,,
public class Dog extends Animal {
	
	
	public void detailsOfChildClass() {
		System.out.println("Name  "+name);
		System.out.println("No Of Legs: "+noOfLegs);
	}
	public void barks() {
		System.out.println("Dogs are barking,,,,,,,,,");
	}
	public void pet() {
		System.out.println("Dogs are pet animals,,,,,,,,,");
	}

}
