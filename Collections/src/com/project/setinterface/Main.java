package com.project.setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
//set--->elements of order of insertion is not preserved,,,,,,,,,,
//set-->it should not accept duplicate values,,,,,,,,,,,
//set-->only one null value,,,,,,,,,,,,,
public class Main {
	public static void main(String [] args) {
		Set<String> container=new HashSet<String>();
		container.add("Pen");
		container.add("Book");
		container.add("Pencil");
		container.add("Paper");
		container.add("School");
		container.add("Laptop");
		container.add("Table");
		container.add("Collage");
		container.add("Pen");
		container.add(null);
		container.add(null);
//		container.remove("Pen");
		Set<String> duplicateConatainer=new HashSet<String>();
		duplicateConatainer.addAll(container);
		System.out.println("Duplicate Container: "+duplicateConatainer);
		
		System.out.println(container.size());
		System.out.println(container.equals(duplicateConatainer));
	
		
		System.out.println(container);
		
		//print by suing for each loop
		System.out.println("print by using for each loop");
		for(String str:container) {//for-each loop
			System.out.println(str);
		}
		System.out.println("iterate by using iterator interface,,,,,,,");
		//iterate by using iterator interface,,,,,,,
		Iterator<String> itr=container.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	
		
	}

}
