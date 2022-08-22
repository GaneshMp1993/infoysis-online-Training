package com.project.finaldemousingiib;

//Final-->declearing canstant value,,,,,,,,
//you must initialize value at the declearation only,,,,,,,,
//static keyword,,,,,,,,,,,//the final variable should in Capital letter
public class PowerBank {
	final static String FULL_CHARGED = "YES";
	final int CAPACITY = 2000;// In line

	final void demo() {
		int copyCapacity = CAPACITY;
		copyCapacity++;
		System.out.println(copyCapacity);
	}

}
