package com.xworkz.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Paint {

	
	private String name;

	
	private int litresRequired;

	
	private String paintType;

	
	private double priceOfPaint;

	public Paint() {
		System.out.println("Invoked No args of Construtor Paint");
	}


	public Paint(String name, int litresRequired, String paintType, double priceOfPaint) {
		super();
		this.name = name;
		this.litresRequired = litresRequired;
		this.paintType = paintType;
		this.priceOfPaint = priceOfPaint;
	}

	public String getName() {
		return name;
	}

	@Value ("AsianPaints")
	public void setName(String name) {
		this.name = name;
	}

	@Value ("20000")
	public int getLitresRequired() {
		return litresRequired;
	}

	public void setLitresRequired(int litresRequired) {
		this.litresRequired = litresRequired;
	}

	public String getPaintType() {
		return paintType;
	}

	@Value ("OilPaint")
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	public double getPriceOfPaint() {
		return priceOfPaint;
	}

	@Value ("5000.00")
	public void setPriceOfPaint(double priceOfPaint) {
		this.priceOfPaint = priceOfPaint;
	}


	@Override
	public String toString() {
		return "Paint [name=" + name + ", litresRequired=" + litresRequired + ", paintType=" + paintType
				+ ", priceOfPaint=" + priceOfPaint + "]";
	}

	

}
