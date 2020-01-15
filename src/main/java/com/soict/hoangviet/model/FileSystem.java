package com.soict.hoangviet.model;

public class FileSystem {
	private String abbreviate;
	private String fullname;
	private String type;
	private String date;
	private String computer;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}

	public FileSystem(String abbreviate, String fullname, String type) {
		super();
		this.abbreviate = abbreviate;
		this.fullname = abbreviate;
		this.type = type;
	}
	
	public String getAbbreviate() {
		return abbreviate;
	}
	public void setAbbreviate(String abbreviate) {
		this.abbreviate = abbreviate;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
