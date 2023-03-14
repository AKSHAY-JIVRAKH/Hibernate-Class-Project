package com.mapping.xml;

public class Books {
	
	private int autId;
	private String autName;
	private String autBook;
	private String autCity;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(int autId, String autName, String autBook, String autCity) {
		super();
		this.autId = autId;
		this.autName = autName;
		this.autBook = autBook;
		this.autCity = autCity;
	}

	public int getAutId() {
		return autId;
	}

	public void setAutId(int autId) {
		this.autId = autId;
	}

	public String getAutName() {
		return autName;
	}

	public void setAutName(String autName) {
		this.autName = autName;
	}

	public String getAutBook() {
		return autBook;
	}

	public void setAutBook(String autBook) {
		this.autBook = autBook;
	}

	public String getAutCity() {
		return autCity;
	}

	public void setAutCity(String autCity) {
		this.autCity = autCity;
	}

	@Override
	public String toString() {
		return "Books [autId=" + autId + ", autName=" + autName + ", autBook=" + autBook + ", autCity=" + autCity + "]";
	}
}
