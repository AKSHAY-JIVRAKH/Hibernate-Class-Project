package com.vision.cascading;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Standard_11th {

	@Id
	private int rollNo;
	private String name;
	private int age;
	
    @ManyToOne
	private City1 city;

	public Standard_11th() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Standard_11th(int rollNo, String name, int age, City1 city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.city = city;
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

	public City1 getCity() {
		return city;
	}

	public void setCity(City1 city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Standard_11th [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	
	
	
}
