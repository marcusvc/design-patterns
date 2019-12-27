package edu.marcus.designpatterns.creational.factory;

import edu.marcus.designpatterns.behavioral.command.Chef;
import edu.marcus.designpatterns.behavioral.command.Food;

public final class ChefFactory {
	
	private ChefFactory() {}
	
	public static Chef getChef(Cuisine cuisine, Food food) {
		switch (cuisine) {
		case BRAZILIAN:
			return new BrazilianChef(food);
		case CHINESE:
			return new ChineseChef(food);
		case MEXICAN:
			return new MexicanChef(food);
		default:
			throw new IllegalStateException("No chef available for " + cuisine + " cuisine");
		}
	}

}
