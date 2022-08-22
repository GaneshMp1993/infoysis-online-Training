package com.porject.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(50);
		list.add(52);
		list.add(36);
		list.add(41);
		list.add(20);
		list.add(16);
		//list without streams
		List<Integer> evenList=new ArrayList<Integer>();
		for(Integer i:list) {
			if(i%2==0) {
				evenList.add(i);
			}
			
		}
		System.out.println("All Numbers present inside the container: "+list);
		System.out.println("Even Numbers: "+evenList);
		//using stream api
		Stream<Integer> stream=list.stream();
		System.out.println("By using stream API,,,,,,,,,,");
		List<Integer> evenNumberStream=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumberStream);
		System.out.println("By using another way,,,,,,,,,,,");
		List<Integer> newsEvenList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newsEvenList);
	}

}
