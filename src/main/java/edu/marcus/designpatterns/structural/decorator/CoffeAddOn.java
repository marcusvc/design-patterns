package edu.marcus.designpatterns.structural.decorator;

public abstract class CoffeAddOn extends Coffe {
	
	protected Coffe coffe;
	
	public CoffeAddOn(String description, double price, Coffe coffe) {
		super(description, price);
		this.coffe = coffe;
	}
	
	@Override
	public String getDescription() {
		return coffe.getDescription() + " with " + super.getDescription();
	}
	
	@Override
	public double getPrice() {
		return coffe.getPrice() + super.getPrice();
	}

}
