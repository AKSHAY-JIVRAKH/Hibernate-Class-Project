package com.vision.ProjectWithMaven;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Employee_Address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID")
	private int addressID;
	
	@Column(name="STREET", length=100)
	private String street;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PINCODE")
	private int pincode;
	
	@Column(name="DATE")
	@Temporal(TemporalType.DATE)
	private Date addeddate;
	
	@Transient
	private int abc;
	
	@Lob
	private byte[] images;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressID, String street, String state, int pincode, Date addeddate, int abc, byte[] images) {
		super();
		this.addressID = addressID;
		this.street = street;
		this.state = state;
		this.pincode = pincode;
		this.addeddate = addeddate;
		this.abc = abc;
		this.images = images;
	}

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Date getAddeddate() {
		return addeddate;
	}

	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}

	public int getAbc() {
		return abc;
	}

	public void setAbc(int abc) {
		this.abc = abc;
	}

	public byte[] getImages() {
		return images;
	}

	public void setImages(byte[] images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", street=" + street + ", state=" + state + ", pincode=" + pincode
				+ ", addeddate=" + addeddate + ", abc=" + abc + ", images=" + Arrays.toString(images) + "]";
	}
}
