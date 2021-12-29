package com.xworkz.watch.dto;

public class WatchDTO {

	private String name;

	private String email;

	private String address;

	private long mobileNumber;

	private int enterId;



	public WatchDTO() {
		super();
		System.out.println("DTO class is Created:"+this.getClass().getSimpleName());
	}

	public WatchDTO(String name, String email, String address, long mobileNumber, int enterId) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.enterId = enterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getEnterId() {
		return enterId;
	}

	public void setEnterId(int enterId) {
		this.enterId = enterId;
	}

	@Override
	public String toString() {
		return "WatchDTO [name=" + name + ", email=" + email + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", enterId=" + enterId + "]";
	}




}
