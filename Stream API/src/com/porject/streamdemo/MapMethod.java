package com.porject.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(30);
		list.add(15);
		list.add(25);
		list.add(35);
		list.add(50);
		list.add(12);
		list.add(55);
		list.add(66);
		List<Integer> newList=list.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println("List Container: "+list);
		System.out.println("New List Container: "+newList);
		System.out.println("By using for each Loop");
		list.stream().map(i->i*i).forEach(i->System.out.println(i));
		System.out.println("By using method reference,,,,,,,,,,,,,,,,");
		list.stream().forEach(System.out::println);
		System.out.println("*********************");
		System.out.println("Data sorting by using Stream API");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("To find minimum data in the list container,,,,,,,,,,,");
		Integer minimumNumber=list.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(minimumNumber);
		System.out.println("To find Maximum number in the list Container,,,,,,,,,,");
		Integer maxNumber=list.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(maxNumber);
		
		
	}

}
