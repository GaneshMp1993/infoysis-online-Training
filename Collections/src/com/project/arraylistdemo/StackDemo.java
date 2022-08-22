package com.project.arraylistdemo;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
	public static void main(String[] args) {
		Vector<String> vectorDemo=new Vector<String>();
		
		Stack<String> stackdemo=new Stack<String>();
		stackdemo.push("Laptop");//adding
		stackdemo.push("Mobile");
		stackdemo.push("Mouse");
		stackdemo.push("Keyboard");
		stackdemo.push("Charger");
//		stackdemo.pop();//removing from top of the stack
//		stackdemo.pop();
		System.out.println(stackdemo.peek());//finding element in top of the stack
		
		System.out.println(stackdemo);
		System.out.println("prinitng over a For each loop");
		for(String str:stackdemo) {
			System.out.println(str);
		}
		System.out.println("using iterator interface,,,,,,,,,,,,,,");
		Iterator<String> itr=stackdemo.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
