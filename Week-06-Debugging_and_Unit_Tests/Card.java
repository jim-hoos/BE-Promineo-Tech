package com.promineotech.week06;

public class Card {
	String name;
	int value;
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public void describe() {
		System.out.println("Name: " + name + " \tValue: " + value);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
