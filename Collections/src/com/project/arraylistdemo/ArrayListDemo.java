package com.project.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//list-->it should accept the duplicate values,,,,,,,,,
//list-->the insertion order is preserved,,,,,,,,,,,,,,
public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> container=new ArrayList<String>();//creation of conatiner
		container.add("Sampath");
		container.add("Jaysurya");
		container.add("Sairupesh");
		container.add("Vamsi");
		container.add("Vamsi");
		container.add("Ganesh");
		container.add("Varaprasad");
		container.add("Ganesh");
//		container.remove("Ganesh");
//		container.add(2, "School");
		
//		System.out.println(container.indexOf("Jaysurya"));
//		System.out.println(container);
		//using for each loop
//		for(String names:container) {
//			System.out.println(names);
//		}
		System.out.println("Iterating over iterator interface,,,,,,,,,,,");
		//by using iterator interface,,,,,,,,,,,
		Iterator<String> itr=container.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		System.out.println("iterating over listiterator,,,,,,,,,,,,,");
//		ListIterator<String> listitr=container.listIterator();
//		while(listitr.hasNext()) {
//			System.out.println(listitr.next());
//		}
//		System.out.println("Reverse Direction,,,,,,,,,,,,,,,");
//		while(listitr.hasPrevious()) {
//			System.out.println(listitr.previous());
//		}
	}
	

}
