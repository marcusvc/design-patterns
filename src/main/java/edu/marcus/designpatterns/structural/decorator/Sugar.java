package edu.marcus.designpatterns.structural.decorator;

public class Sugar extends CoffeAddOn {
	
	public Sugar(Coffe coffe) {
		super("Sugar", 0.8, coffe);
	}

}
