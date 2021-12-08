package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tyre_details")
public class TyreClass implements java.io.Serializable {


	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name ="tyre_detailsID")
	private int tyreID;

	@Column (name="NAME")
	private String name;

	@Column (name="PRICE")
	private double price;

	@Column (name="WARRANTY")
	private int warranty;

	@Column (name="TUBLESS")
	private boolean tubeless;

	@Column (name="WIDTHTYRE")
	private int widthTyre;

	public TyreClass() {
		System.out.println("Invoked the No args of Contructor Tyre Class");
	}


	public TyreClass(int tyreID, String name, double price, int warranty, boolean tubeless, int widthTyre) {
		super();
		this.tyreID = tyreID;
		this.name = name;
		this.price = price;
		this.warranty = warranty;
		this.tubeless = tubeless;
		this.widthTyre = widthTyre;
	}



	public int getTyreID() {
		return tyreID;
	}


	public void setTyreID(int tyreID) {
		this.tyreID = tyreID;
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


	public int getWarranty() {
		return warranty;
	}


	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}


	public boolean isTubeless() {
		return tubeless;
	}


	public void setTubeless(boolean tubeless) {
		this.tubeless = tubeless;
	}


	public int getWidthTyre() {
		return widthTyre;
	}


	public void setWidthTyre(int widthTyre) {
		this.widthTyre = widthTyre;
	}


	@Override
	public String toString() {
		return "TyreClass [tyreID=" + tyreID + ", name=" + name + ", price=" + price + ", warranty=" + warranty
				+ ", tubeless=" + tubeless + ", widthTyre=" + widthTyre + "]";
	}






}
