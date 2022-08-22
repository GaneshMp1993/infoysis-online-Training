package com.project.lamdbademo;

public class Tester {
	public static void main(String[] args) {
		//By using object of impl class
		Impl impl=new Impl();
		impl.sayHello();
		
		//by using ananymous class
		MyInter impl1=new MyInter() {
			
			@Override
			public void sayHello() {
				System.out.println("Hii,,this is Core java sessions");
				
			}
		};
		impl1.sayHello();
		//by using lambda expresions,,,,,,for SIngle line implementation
		MyInter lambda=()->System.out.println("Hiii");
		lambda.sayHello();
		
		//for multiple lines of method implementation
		MyInter lambda1=()->{
			System.out.println("Welcome to sessions,,,,,,,,,,,");
			System.out.println("Welcome to Database sessions,,,,,,,,,,,,,");
			
		};
		lambda1.sayHello();
	//using lambda expression
		StringInterface st=(str->str.length());
		System.out.println(st.getLength("GaneshGuruKotresh"));
	}
}
