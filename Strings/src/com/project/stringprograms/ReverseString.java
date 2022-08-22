package com.project.stringprograms;

public class ReverseString {
	public static void main(String[] args) {
		String str="School";
		String reverse="";
		//iterate throught String from last and add each character to variable reverse
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Original String :"+str);
		System.out.println("Reverse String: "+reverse);
	}

}
