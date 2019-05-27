package com.demo.convert.numbers.model;

public class Number {
	
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Number(String number) {
		super();
		this.number = number;
	}
	
	public int toInt() {
		return Integer.parseInt(number);
	}
	
	@Override
	public String toString() {
		return "Number [Number=" + number + "]";
	}
	
   
	
	
}
