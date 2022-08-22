package com.project.setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumericDemo {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(23);
		set.add(25);
		set.add(30);
		set.add(40);
		set.add(15);
		set.add(67);
		set.add(13);
		set.add(53);
		set.add(0);
		set.add(0);
		System.out.println(set);
		
		System.out.println("printing data by using for-each loop");
		for(int i:set) {
			System.out.println(i);
		}
		System.out.println("iterating over iterator interface,,,,,,,,,");
		Iterator<Integer>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
