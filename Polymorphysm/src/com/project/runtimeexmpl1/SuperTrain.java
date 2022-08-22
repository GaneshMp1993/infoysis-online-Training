package com.project.runtimeexmpl1;
//child class
public class SuperTrain extends ExpressTrain {
public static final int  speed=150;
	@Override
	public void mySpeed() {
		System.out.println("Speed of SuperTrain train is: "+speed);
	}

}
