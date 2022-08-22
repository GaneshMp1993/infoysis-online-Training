package com.project.constructordemo;

public class Tester {
	public static void main(String[] args) {
		Fan fan=new Fan();
		System.out.println(fan);
		System.out.println("*******************");
		Fan fan1=new Fan(3);
		fan1.cool();
		System.out.println(fan1);
		System.out.println("************************");
		Fan fan2=new Fan(2, "GM");
		System.out.println(fan2);
		fan2.cool();
		System.out.println("*******************");
		Fan fan3=new Fan(3, "LG", 3500.00);
		System.out.println(fan3);
		fan3.cool();
		System.out.println("*************************");
		Fan fan4=new Fan(2, "Havels", 3200.00, 1200);
		System.out.println(fan4);
		System.out.println("**************************");
		Fan fan5=new Fan(3, "LG", 3500.00, 1000, "Blue");
		System.out.println(fan5);
		

		
//		System.out.println(fan1.noOfWings);
//		System.out.println("******************");
//		System.out.println(fan2.noOfWings);
//		System.out.println(fan2.campany);
//		System.out.println(fan3.noOfWings);
//		System.out.println(fan3.campany);
//		System.out.println(fan3.price);
//		System.out.println("Fan campany:"+fan.campany);
//		System.out.println("Fan Color: "+fan.color);
//		System.out.println("Fan Wings:"+fan.noOfWings);
//		System.out.println("Fan Price: "+fan.price);
//		System.out.println("Fan RPM:"+fan.rpm);
//		System.out.println("*************************");
//		System.out.println("Calling from parametrised costructor,,,,,,,,,,,");
//		System.out.println("Fan campany:"+fan1.campany);
//		System.out.println("Fan Color: "+fan1.color);
//		System.out.println("Fan Wings:"+fan1.noOfWings);
//		System.out.println("Fan Price: "+fan1.price);
//		System.out.println("Fan RPM:"+fan1.rpm);
	}

}
