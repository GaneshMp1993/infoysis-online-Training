package com.project.demo1;

public class Manager extends Interview {
	public Manager(String name) {
		super(name);
	}

	public Manager(String name, String panNumber, String result) {
		super(name, panNumber, result);
		this.aptitute(14);
		this.technicalSkills(11);
	}

}
