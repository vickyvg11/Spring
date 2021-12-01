package com.xworkz.engine;

public class EngineClass {

	private String engineName;

	private TYPE type;

	private int numberCylinders;

	private EngineOil engineOil;

	private int cubicCapacity;

	private ConnectingRod connectingRod;

	public EngineClass() {
		System.out.println(this.getClass().getName()+"Bean Created");
	}


	public EngineClass(String engineName,TYPE type, int numberCylinders, EngineOil engineOil, int cubicCapacity,
			ConnectingRod connectingRod) {

		this.engineName = engineName;
		this.type = type;
		this.numberCylinders = numberCylinders;
		this.engineOil = engineOil;
		this.cubicCapacity = cubicCapacity;
		this.connectingRod = connectingRod;
		System.out.println(this.getClass()+":Bean of Engine Class Created");
	}


	public String getEngineName() {
		return engineName;
	}


	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}


	public TYPE getType() {
		return type;
	}


	public void setType(TYPE type) {
		this.type = type;
	}


	public int getNumberCylinders() {
		return numberCylinders;
	}


	public void setNumberCylinders(int numberCylinders) {
		this.numberCylinders = numberCylinders;
	}


	public EngineOil getEngineOil() {
		return engineOil;
	}


	public void setEngineOil(EngineOil engineOil) {
		this.engineOil = engineOil;
	}


	public int getCubicCapacity() {
		return cubicCapacity;
	}


	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}


	public ConnectingRod getConnectingRod() {
		return connectingRod;
	}


	public void setConnectingRod(ConnectingRod connectingRod) {
		this.connectingRod = connectingRod;
	}






}



