package com.xworkz.engine;

public class ConnectingRod {
	
	private int lengthOfRod;

	private String material;
	
	
	
	public ConnectingRod() {
		System.out.println(this.getClass()+":Bean Created");
	}

	public ConnectingRod(int lengthOfRod, String material) {
		super();
		this.lengthOfRod = lengthOfRod;
		this.material = material;
	}

	public int getLengthOfRod() {
		return lengthOfRod;
	}

	public void setLengthOfRod(int lengthOfRod) {
		this.lengthOfRod = lengthOfRod;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "ConnectingRod [lengthOfRod=" + lengthOfRod + ", material=" + material + "]";
	}
	
	
}
