package com.project.entity.samsung;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "samsung")
public class Samsung {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "RAM")
	private int ram;
	@Column(name = "IS_FINGER_PRINT_SUPPORTED")
	private boolean is_Finger_Print_Supported;

	public Samsung() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samsung(int id, String name, String color, double price, int ram, boolean is_Finger_Print_Supported) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.ram = ram;
		this.is_Finger_Print_Supported = is_Finger_Print_Supported;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public boolean isIs_Finger_Print_Supported() {
		return is_Finger_Print_Supported;
	}

	public void setIs_Finger_Print_Supported(boolean is_Finger_Print_Supported) {
		this.is_Finger_Print_Supported = is_Finger_Print_Supported;
	}

	@Override
	public String toString() {
		return "Samsung [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", ram=" + ram
				+ ", is_Finger_Print_Supported=" + is_Finger_Print_Supported + "]";
	}

}
