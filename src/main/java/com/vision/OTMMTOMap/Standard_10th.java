package com.vision.OTMMTOMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity
public class Standard_10th {

	@Id
	private int rollNo;
	private String name;
	private int age;
	
    @ManyToOne
	private City city;

	public Standard_10th() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Standard_10th(int rollNo, String name, int age, City city) {

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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Standard_10th [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

   
	
}
