package edu.marcus.designpatterns.creational.factory;

import edu.marcus.designpatterns.behavioral.command.Chef;
import edu.marcus.designpatterns.behavioral.command.Food;

public class Kitchen {
	
	public static void main(String[] args) {
		Chef chef1 = ChefFactory.getChef(Cuisine.BRAZILIAN, new Food("Feijoada"));
		chef1.execute();
		
		Chef chef2 = ChefFactory.getChef(Cuisine.CHINESE, new Food("Kung Pao Chicken"));
		chef2.execute();
		
		Chef chef3 = ChefFactory.getChef(Cuisine.MEXICAN, new Food("Burrito"));
		chef3.execute();
	}

}
