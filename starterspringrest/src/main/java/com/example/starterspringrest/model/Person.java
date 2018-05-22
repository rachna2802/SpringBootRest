package com.example.starterspringrest.model;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;

public class Person {
 private int personId;
 private String name;
 private int age;

 private Address address;
 
 private List<Car> carlist;
 

	public Person(int personId, String name, int age, Address address, List<Car> carlist) {
	super();
	this.personId = personId;
	this.name = name;
	this.age = age;
	this.address = address;
	this.carlist = carlist;
}
	public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	

	public List<Car> getCarlist() {
	return carlist;
}
public void setCarlist(List<Car> carlist) {
	this.carlist = carlist;
}

}
