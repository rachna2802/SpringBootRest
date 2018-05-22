package com.example.starterspringrest.model;

public class Car {

	private String carName;
	private String color;
	private String brand;
	public Car(String carName, String color, String brand) {
		super();
		this.carName = carName;
		this.color = color;
		this.brand = brand;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}

}
