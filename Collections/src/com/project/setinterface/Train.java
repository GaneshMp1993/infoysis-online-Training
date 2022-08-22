package com.project.setinterface;

public class Train {
	int slNo;
	String name;
	String departurePlace;
	String arrivalPlace;
	boolean isSuperFast;
	
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int slNo, String name, String departurePlace, String arrivalPlace, boolean isSuperFast) {
		super();
		this.slNo = slNo;
		this.name = name;
		this.departurePlace = departurePlace;
		this.arrivalPlace = arrivalPlace;
		this.isSuperFast = isSuperFast;
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

	public String getDeparturePlace() {
		return departurePlace;
	}

	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}

	public String getArrivalPlace() {
		return arrivalPlace;
	}

	public void setArrivalPlace(String arrivalPlace) {
		this.arrivalPlace = arrivalPlace;
	}

	public boolean isSuperFast() {
		return isSuperFast;
	}

	public void setSuperFast(boolean isSuperFast) {
		this.isSuperFast = isSuperFast;
	}

	@Override
	public String toString() {
		return "Train [slNo=" + slNo + ", name=" + name + ", departurePlace=" + departurePlace + ", arrivalPlace="
				+ arrivalPlace + ", isSuperFast=" + isSuperFast + "]";
	}
	
	

}
