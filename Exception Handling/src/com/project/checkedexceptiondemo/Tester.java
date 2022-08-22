package com.project.checkedexceptiondemo;

public class Tester {
	public static void main(String[] args) {
		Bouncer bouncer=new Bouncer();
		
		try {
			bouncer.checkAge(20);
		}
		catch(PubException e) {
			System.out.println(e.getMessage());
		}
	}

}
