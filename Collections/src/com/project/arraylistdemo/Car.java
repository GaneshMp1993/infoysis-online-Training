package com.project.arraylistdemo;

public class Car {
	int slNo;
	String name;
	int price;
	String brand;
	int cc;
	boolean isAirBagsProvided;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(int slNo, String name, int price, String brand, int cc, boolean isAirBagsProvided) {
		super();
		this.slNo = slNo;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.cc = cc;
		this.isAirBagsProvided = isAirBagsProvided;
	}
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public boolean isAirBagsProvided() {
		return isAirBagsProvided;
	}
	public void setAirBagsProvided(boolean isAirBagsProvided) {
		this.isAirBagsProvided = isAirBagsProvided;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + cc;
		result = prime * result + (isAirBagsProvided ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + slNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cc != other.cc)
			return false;
		if (isAirBagsProvided != other.isAirBagsProvided)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (slNo != other.slNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [slNo=" + slNo + ", name=" + name + ", price=" + price + ", brand=" + brand + ", cc=" + cc
				+ ", isAirBagsProvided=" + isAirBagsProvided + "]";
	}
	
	

}
