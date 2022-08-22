package com.project.demo1;

public class Interview {
	String name;
	String panNumber;
	String result;

	public Interview() {
		// TODO Auto-generated constructor stub
	}
	public void technicalSkills(int score) {
		System.out.println("Involked technicalSkills()");
		if(score>10) {
			System.out.println("Cleared technical Round,,,,,,,,,");
		}
		else {
			System.out.println("Not cleared,,,,,,,,,");
		}
	}
	public void aptitute(int score) {
		System.out.println("Interview.aptitute()");
		if(score>10) {
			System.out.println("Cleared,,,,,,,,,,");
		}
		else {
			System.out.println("Not cleared,,,,,,,,,,");
		}

	}
	public Interview(String name) {
		super();
		this.name = name;
	}
	public Interview(String name, String panNumber, String result) {
		super();
		this.name = name;
		this.panNumber = panNumber;
		this.result = result;
	}
	@Override
	public String toString() {
		return "Interview [name=" + name + ", panNumber=" + panNumber + ", result=" + result + "]";
	}


}
