package com.project.checkedexceptiondemo;

public class PubException extends Exception {

	public String getMessage() {
		return "You are too young to enter the PUB ";
	}
}
