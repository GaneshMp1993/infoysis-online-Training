package com.project.runtime;

public class Tester {
	public static void main(String[] args) {
		Rbi rbi=new Rbi();
		rbi.displayRateOfIntrest();
		
		Axis axis=new Axis();
		axis.displayRateOfIntrest();
		
		Rbi rbi1=new Axis();//overriding in java
		rbi1.displayRateOfIntrest();
	}

}
