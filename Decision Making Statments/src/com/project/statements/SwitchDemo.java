package com.project.statements;

public class SwitchDemo {
	public static void main(String[] args) {
		String trafficSignal = "Green";
		switch (trafficSignal) {
		case "Red":
			System.out.println("Please stop the vehicle,,,,,,,");
			break;
		case "Yellow":
			System.out.println("Get Ready for move,,,,,,,");
			break;
		case "Green":
			System.out.println("You can move freely,,,,,,,,");
			break;
		default:
			System.out.println("Input is invalid,,,,,,,,,,,,,");
		}
	}

}
