package com.project.statements;

public class IfElseIfLadder {
	public static void main(String[] args) {
		boolean haveAdharCard = false;
		boolean havePancard = false;
		boolean haveVoterIdCard = false;
		if (haveAdharCard) {
			System.out.println("Condition 1: students are citizen of india");
		} else if (havePancard) {
			System.out.println("Condition 2:Students are citizen of india");
		} else if (haveVoterIdCard) {
			System.out.println("Condition 3:Students are citizen of india");
		} else {
			System.out.println("you are not citizen of india,,,,,,,,,,");
		}
	}

}
