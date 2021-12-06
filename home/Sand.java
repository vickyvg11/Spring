package com.xworkz.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sand {


	private String type;


	private int price;


	private String grade;

	public Sand() {
		System.out.println("Invoked no args Of Sand");
	}


	public Sand(String type, int price, String grade) {
		super();
		this.type = type;
		this.price = price;
		this.grade = grade;
	}


	public String getType() {
		return type;
	}

	@Value("MSand")
	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	@Value("20000")
	public void setPrice(int price) {
		this.price = price;
	}

	public String getGrade() {
		return grade;
	}

	@Value("A Grade")
	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Sand [type=" + type + ", price=" + price + ", grade=" + grade + "]";
	}


}
