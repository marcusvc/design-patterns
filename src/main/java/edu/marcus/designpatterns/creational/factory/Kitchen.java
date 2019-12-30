package edu.marcus.designpatterns.creational.factory;

import edu.marcus.designpatterns.behavioral.command.Chef;
import edu.marcus.designpatterns.behavioral.command.Food;

public class Kitchen {
	
	public static void main(String[] args) {
		Chef chef;
		chef = Cuisine.BRAZILIAN.create(new Food("Feijoada"));
		chef.execute();
		
		chef = Cuisine.CHINESE.create(new Food("Kung Pao Chicken"));
		chef.execute();
		
		chef = Cuisine.MEXICAN.create(new Food("Burrito"));
		chef.execute();
	}

}
