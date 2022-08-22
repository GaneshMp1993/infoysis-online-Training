package com.project.typecastingdemo;

public class ImplicitTypeCastingDemo {// implicit typecasting will be done
	//	by compiler automatically,,,,,,
	public static void main(String[] args) {
		byte byteValue = 127;// 8 bits
		int intValue = byteValue; // 32 bits
		short shortValue = 25;// 16 bits
		int intValue1 = shortValue;// 32 bits
		long longValue = intValue;// 64 bits
		float floatValue = 150.35f;// 32 bits
		double doubleValue = floatValue;// 64 bits

		System.out.println("Converting byte into int: " + intValue);
		System.out.println("Converting short into int: " + intValue1);
		System.out.println("Converting int into long: " + longValue);
		System.out.println("Connverting float into double: " + doubleValue);
	}

}
