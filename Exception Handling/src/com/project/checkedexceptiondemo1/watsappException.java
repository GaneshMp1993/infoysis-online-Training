package com.project.checkedexceptiondemo1;

public class watsappException extends Exception {
	String message;

	public watsappException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
}
