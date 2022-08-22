package com.project.stringprograms;

public class CheckPalandromeNumber {//535-->535,121-->121,353--->353
	public static void main(String[] args) {
		int number=3454;
		int temp=number;
		int reverse=0;
		int reminder;
		
		while(temp!=0) {
			reminder=temp%10;
			reverse=reverse*10+reminder;
			temp=temp/10;
			}
		if(number==reverse) {
			System.out.println("It is a palindrome number,,,,,,,,,,");
		}
		else {
			System.out.println("It is not a palindrone number,,,,,,,,,,");
		}
		
	}

}
