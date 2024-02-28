package org.jsp.spring;

public class PanCard {
	private String number;
	private String pincode;
	
	public void display() {
		System.out.println("Number :"+number);
		System.out.println("Pincode :"+pincode);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
