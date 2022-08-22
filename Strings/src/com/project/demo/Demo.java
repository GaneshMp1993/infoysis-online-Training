package com.project.demo;

public class Demo {
	public static void main(String[] args) {
		// String literals
		// this data is saved in the SCP Memory(String canstant pool)
        String string3 = "Laptop";
		String string4 = "laptop";
		System.out.println(string3.hashCode());//
		System.out.println(string4.hashCode());//
		System.out.println(string3==string4);//==operator always goes for content comparision
		
		String string=new String("GANESH");//the object creates in heap memory
		String string1=new String("GANESH");
		System.out.println(string.equals(string1));
//		equals()always looks address comparasion
		string.concat("Java Devoloper");
		System.out.println(string==string1);
		System.out.println(string.hashCode());
		System.out.println(string1.hashCode());
		System.out.println(string.charAt(3));
		System.out.println(string.concat(string1));
		System.out.println(string.equalsIgnoreCase(string1));
		System.out.println(string.isEmpty());
		System.out.println(string.contains("t"));
		System.out.println(string.contains(string1));
		System.out.println(string.isBlank());
		System.out.println(string.indexOf('N'));
		System.out.println(string.compareToIgnoreCase(string1));
	}
}
