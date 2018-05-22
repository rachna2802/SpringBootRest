package com.example.starterspringrest.model;

public class Address {

	private int addId;
	private int doorNo;
	private String streetName; 
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Address(int addId, int doorNo, String streetName) {
		super();
		this.addId = addId;
		this.doorNo = doorNo;
		this.streetName = streetName;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}

}
