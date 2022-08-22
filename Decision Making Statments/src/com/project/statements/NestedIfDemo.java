package com.project.statements;

public class NestedIfDemo {
	public static void main(String[] args) {
		boolean havingAdharCard=true;
		boolean haveAccountNumber=true;
		boolean haveMinimumBalance=true;
		int salary=23000;
		
		if(havingAdharCard) {
			if(haveAccountNumber) {
				if(haveMinimumBalance) {
					if(salary>20000) {
						System.out.println("You are eligible for credit card,,,,,,,");
					}
					else {
						System.out.println("you are salary is less than 20k");
					}
				}
				else {
					System.out.println("You dont have minimum balance,,,,,");
				}
			}
			else {
				System.out.println("You dont have a Account Number,,,,,");
			}
		}
		else {
			System.out.println("You dont have Adhar card,,,,,,,,,,,,,,,,,");
		}
		
	}

}
