package edu.marcus.designpatterns.structural.decorator;

public class Milk extends CoffeAddOn {
	
	public Milk(Coffe coffe) {
		super("Milk", 1.1, coffe);
	}

}
