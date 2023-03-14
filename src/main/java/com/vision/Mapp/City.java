package com.vision.Mapp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class City {

@Id
private int cid;
private String city;

@OneToOne(mappedBy="city")
@JoinColumn(name="STANDARD")
private  Standard_9th std;

public City() {
	super();
	// TODO Auto-generated constructor stub
}

public City(int cid, String city) {
	super();
	this.cid = cid;
	this.city = city;
}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}


public Standard_9th getStd() {
	return std;
}

public void setStd(Standard_9th std) {
	this.std = std;
}

@Override
public String toString() {
	return "City [cid=" + cid + ", city=" + city + "]";
}

}
