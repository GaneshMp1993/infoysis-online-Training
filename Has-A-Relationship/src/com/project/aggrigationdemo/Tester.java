package com.project.aggrigationdemo;

public class Tester {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.id=01;
		stu.name="Surya";
		stu.collageName="Jain";
		
		
		Liberary lib=new Liberary();
		lib.name="Digital Liberary";
		lib.cantactNumber=4645642344l;
		lib.location="Bangalore";
		lib.student=stu;
		
		System.out.println(stu.id);
		System.out.println(stu.name);
		System.out.println(stu.collageName);
		System.out.println("****************");
		System.out.println("Detials of Liberary class,,,,,,,,,");
		System.out.println(lib.student.collageName);
		System.out.println(lib.student.id);
		System.out.println(lib.student.name);
		lib.student.studentDetails();
	}

}
