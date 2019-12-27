package edu.marcus.designpatterns.creational.factory;

import edu.marcus.designpatterns.behavioral.command.Chef;
import edu.marcus.designpatterns.behavioral.command.Food;

public class ChineseChef extends Chef {

	public ChineseChef(Food food) {
		super(food);
	}

	@Override
	public void execute() {
		System.out.println("Chinese chef cooking " + getFood().getDescription());
	}

}
