package edu.marcus.designpatterns.creational.factory;

import edu.marcus.designpatterns.behavioral.command.Chef;
import edu.marcus.designpatterns.behavioral.command.Food;

public class MexicanChef extends Chef {

	public MexicanChef(Food food) {
		super(food);
	}

	@Override
	public void execute() {
		System.out.println("Mexican chef cooking " + getFood().getDescription());
	}

}
