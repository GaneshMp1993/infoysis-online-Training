package com.project.methodreference1;

public class Food implements Comparable<Food> {
	private int foodId;
	private String name;
	private double price;
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(int foodId, String name, double price) {
		super();
		this.foodId = foodId;
		this.name = name;
		this.price = price;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Food o) {
		// TODO Auto-generated method stub
		return this.getFoodId()-o.getFoodId();
	}
	

}
