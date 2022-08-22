package com.project.checkedexceptiondemo;

public class Bouncer {
	
	public void checkAge(int age) throws PubException {
		if(age<18) {
			throw new PubException();
		}
		else {
			System.out.println("You can enter the Pub and Enjoy,,,,,,,,,,,");
		}
	}

}
