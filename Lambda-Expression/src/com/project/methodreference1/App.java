package com.project.methodreference1;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class App {
	public static void main(String[] args) {
		Set<Food> set=new HashSet<Food>();
		set.add(new Food(1, "Biriyani", 120.00));
		set.add(new Food(2, "Dosa", 50.0));
		set.add(new Food(3, "Meals", 100.00));
		set.add(new Food(4, "Idle", 70.00));
		System.out.println("fetching set through Method reference,,,,,,,,,,,,");
		set.forEach(System.out::println);
		System.out.println("fetching set through Lambda expresiions,,,,,,,,,,");
		Consumer<Set<Food>> consumer=(f)->System.out.println(set);
		consumer.accept(set);
		System.out.println("Using Method reference,,,,,,,,,,,");
		FoodDAO food=FoodDaoImpl::delicious;
		food.delicious();
		System.out.println("By using lambda expresions,,,,,,,,,,,,,");
		FoodDAO food1=()->System.out.println("Foods are very delicious,,,,,,,,,,,,,");
		food1.delicious();
	}

}
