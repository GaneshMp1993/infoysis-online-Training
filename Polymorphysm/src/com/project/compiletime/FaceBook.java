package com.project.compiletime;

public class FaceBook {

	public void searchUser(int userId) {
		System.out.println("Search for User Id Found: " + userId);
	}

	public void searchUser(long cantactNumber) {
		System.out.println("Search for CantactNumber Found: " + cantactNumber);
	}

	public void searchUser(String fName, String lName) {
		System.out.println("Search for Full Name Found: " + fName + " " + lName);
	}

	public void searchUser(String name) {
		System.out.println("Search for Name Found: " + name);
	}

	public void searchUser(String location, int pincode) {
		System.out.println("Search for Location and pincode Found: " + location + " " + pincode);
	}
}
