package edu.marcus.designpatterns.structural.decorator;

public abstract class Coffe {
	
	private String description;
	private double price;
	
	public Coffe(String description, double price) {
		this.description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}

}
