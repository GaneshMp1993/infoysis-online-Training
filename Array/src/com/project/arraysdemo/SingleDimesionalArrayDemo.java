package com.project.arraysdemo;

public class SingleDimesionalArrayDemo {
	public static void main(String[] args) {
		String[] string=new String[5];//creatiob of array
		//initialization of array
		try {
			
			string[0]="Sampath";
			string[1]="Jaysurya";
			string[2]="4453463443";
			string[3]="3434.645656";
			string[4]="@#$%^&*(*";
			string[5]="Ganesh";
			for(String str:string) {
				System.out.println(str);	
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Memory is overflow,,,,,,please check it once,,,,,");
			
		}
		System.out.println("rest of program execution is performing sucessfully,,,,");
		
		//we can print by using for each loop
		
		
	}

}
