package com.xworkz.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HomeClass {

	
	private String nameOfHome;
	
	
	private String flat;
	
	
	private Paint paint;
	
	
	private int buildArea;
	
	
	private Brick brickUsed;
	
	
	private Sand sand;
	
	public HomeClass() {
		System.out.println("invoked Home with No args Constructor");
	}

	public HomeClass(String nameOfHome, String flat, Paint paint, int buildArea, Brick brickUsed, Sand sand) {
		super();
		this.nameOfHome = nameOfHome;
		this.flat = flat;
		this.paint = paint;
		this.buildArea = buildArea;
		this.brickUsed = brickUsed;
		this.sand = sand;
		
	}

	public String getNameOfHome() {
		return nameOfHome;
	}

	@Value ("Sweet Home")
	public void setNameOfHome(String nameOfHome) {
		this.nameOfHome = nameOfHome;
	}

	public String getFlat() {
		return flat;
	}

	@Value ("2BHK")
	public void setFlat(String flat) {
		this.flat = flat;
	}

	public Paint getPaint() {
		return paint;
	}

	@Autowired
	public void setPaint(Paint paint) {
		this.paint = paint;
	}

	public int getBuildArea() {
		return buildArea;
	}

	@Value ("1156")
	public void setBuildArea(int buildArea) {
		this.buildArea = buildArea;
	}

	public Brick getBrickUsed() {
		return brickUsed;
	}

	public void setBrickUsed(Brick brickUsed) {
		this.brickUsed = brickUsed;
	}

	public Sand getSand() {
		return sand;
	}

	@Autowired
	public void setSand(Sand sand) {
		this.sand = sand;
	}

	@Override
	public String toString() {
		return "HomeClass [nameOfHome=" + nameOfHome + ", flat=" + flat + ", paint=" + paint + ", buildArea="
				+ buildArea + ", brickUsed=" + brickUsed + ", sand=" + sand + "]";
	}
	
}
