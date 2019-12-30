package edu.marcus.designpatterns.creational.factory;

import edu.marcus.designpatterns.behavioral.command.Chef;
import edu.marcus.designpatterns.behavioral.command.Food;

public enum Cuisine implements ChefFactory {
	BRAZILIAN {
		public Chef create(Food food) {
			return new BrazilianChef(food);
		}
	},
	CHINESE {
		public Chef create(Food food) {
			return new ChineseChef(food);
		}
	},
	MEXICAN {
		public Chef create(Food food) {
			return new MexicanChef(food);
		}
	};
}
