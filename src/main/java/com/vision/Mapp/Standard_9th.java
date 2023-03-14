package com.vision.Mapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.vision.Mapp.City;

@Entity
public class Standard_9th {

	@Id
	private int rollNo;
	private String name;
	private int age;
	
	@OneToOne
	@JoinColumn(name="city_ID")
	private City city;
	
	public Standard_9th() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Standard_9th(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Standard_9th [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
}
