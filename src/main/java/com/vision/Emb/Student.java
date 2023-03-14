package com.vision.Emb;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

 @Id
 private int id;
 private String name;
 private String std;
 
 private Address add;
 
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int id, String name, String std) {
	super();
	this.id = id;
	this.name = name;
	this.std = std;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getStd() {
	return std;
}

public void setStd(String std) {
	this.std = std;
}



public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", std=" + std + "]";
}
 

 
}
