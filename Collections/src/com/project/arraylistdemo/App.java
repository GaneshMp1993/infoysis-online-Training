package com.project.arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
	public static void main(String[] args) {
		Car car=new Car(1, "Inova", 2500000, "Tayota", 1500, true);
		Car carDupl=new Car(1, "Inova", 2500000, "Tayota", 1500, true);
		Car car1=new Car(2, "Swift", 600000, "Maruthi", 1100, false);
		Car car2=new Car(3, "Alto", 300000, "Maruthi", 800, false);
		Car car3=new Car(4, "Sonat", 500000, "Kia", 1200, true);
		Car car4=new Car(5, "Punch", 550000, "Tata", 1000, false);
		Car car5=new Car(6, "Nexon", 700000, "Tata", 1200, true);
		
		List<Car> carContainer=new ArrayList<Car>();
		carContainer.add(car5);
		carContainer.add(car);
		carContainer.add(carDupl);
		carContainer.add(car1);
		carContainer.add(car2);
		carContainer.add(car3);
		carContainer.add(car4);
		System.out.println("iterating over a iterator interface");
		Iterator<Car> itr=carContainer.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		carContainer.remove(5);//will rwmoves object which is present in the container
//		carContainer.remove(car);
//	System.out.println(carContainer.contains(car));
//		carContainer.add(new Car(1, "Swift", 250000, "Maruthi", 1100, false));
//		System.out.println(carContainer);
//		carContainer.get(4);
//		System.out.println(carContainer.get(4));
//		System.out.println(carContainer.hashCode());
//		System.out.println(car.hashCode());
//		System.out.println(car1.hashCode());
//		System.out.println(carContainer.size());
//		System.out.println(carContainer.isEmpty());
//		System.out.println(carContainer.set(1, car3));
//		System.out.println(carContainer.contains(car3));
//		System.out.println(carContainer.equals(car5));
//		System.out.println(car.equals(carDupl));
		//iterating over a for each loop
//		for(Car cars:carContainer) {
//			System.out.println(cars);
//		}
		//iterating over a iterator interface
		//iterating over a listIterator
//		System.out.println("iterating over a listIterator");
//		ListIterator<Car> lItr=carContainer.listIterator();
//		System.out.println("Iterating over Farword Direction,,,,,,,,,,,");
//		while(lItr.hasNext()) {
//			System.out.println(lItr.next());
//		}
//		System.out.println("Iterating over Reverse Direction,,,,,,,,,,");
//		while(lItr.hasPrevious()) {
//			System.out.println(lItr.previous());
//		}
//
	}

}
