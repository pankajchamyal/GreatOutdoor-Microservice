	package com.cg.greatoutdoor.addman.model;

public class AddressModel {
	
	private Long retailerId;
	private String addline;
	private String city;
	private String state;
	private Long pincode;
	
	
	public Long getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(Long retailerId) {
		this.retailerId = retailerId;
	}
	public String getAddline() {
		return addline;
	}
	public void setAddline(String addline) {
		this.addline = addline;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	
	
}
