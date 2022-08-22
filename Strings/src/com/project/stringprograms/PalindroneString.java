package com.project.stringprograms;

public class PalindroneString {
	public static void main(String[] args) {//Radar--->radar,//Madam-->madam,level,noon
		String myString="NooN";
		StringBuffer buffer=new StringBuffer(myString);
		buffer.reverse();
		String data=buffer.toString();
		if(myString.equals(data)) {
			System.out.println("Given String is a palindrome,,,,,,,,,,,");
		}
		else {
			System.out.println("Given String is not a palindrone,,,,,,,,,,,,,,");
		}
		
	}

}
