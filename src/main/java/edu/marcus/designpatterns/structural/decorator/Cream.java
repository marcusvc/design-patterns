package edu.marcus.designpatterns.structural.decorator;

public class Cream extends CoffeAddOn {
	
	public Cream(Coffe coffe) {
		super("Cream", 1.5, coffe);
	}

}
