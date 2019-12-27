package edu.marcus.designpatterns.creational.factory;

import edu.marcus.designpatterns.behavioral.command.Chef;
import edu.marcus.designpatterns.behavioral.command.Food;

public class BrazilianChef extends Chef {

	public BrazilianChef(Food food) {
		super(food);
	}

	@Override
	public void execute() {
		System.out.println("Brazilian chef cooking " + getFood().getDescription());
	}

}
