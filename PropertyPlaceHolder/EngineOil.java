package com.xworkz.engine;

public class EngineOil {

	private double price;
	
	private String brand;
	
	private String grade;
	
	
	
	
	public EngineOil() {
		System.out.println(this.getClass()+":Bean Created");
	}

	public EngineOil(double price, String brand, String grade) {
		super();
		this.price = price;
		this.brand = brand;
		this.grade = grade;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
