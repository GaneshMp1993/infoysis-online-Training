package com.projetc.singleandmultilevelinheritence;



public class Tester {
	public static void main(String[] args) {
		Animal animal=new Animal();//parent Object
		
		animal.eat();
		animal.sleep();
		animal.walk();
		
		System.out.println("************************");
		Dog dog=new Dog();
		dog.name="Dog";
		dog.noOfLegs=4;
		dog.detailsOfChildClass();
		dog.barks();
		dog.barks();
		dog.sleep();
		dog.walk();
		dog.eat();
		System.out.println("***************************8");
		Cow cow=new Cow();
		cow.name="Gowri";
		cow.noOfLegs=4;
		cow.sleep();
		cow.eat();
		cow.eatGrass();
		cow.walk();
		cow.provideMilk();
		cow.detailsOfChildClass();
		cow.pet();
		
		
		
	}

}
