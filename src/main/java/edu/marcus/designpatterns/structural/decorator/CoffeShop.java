package edu.marcus.designpatterns.structural.decorator;

public class CoffeShop {

	public static void main(String[] args) {
		Coffe brazilianCoffe = new BrazilianCoffe();
		System.out.println(brazilianCoffe.getDescription() + ": " + brazilianCoffe.getPrice());

		CoffeAddOn brazilianCoffeWithMilk = new Milk(brazilianCoffe);
		System.out.println(brazilianCoffeWithMilk.getDescription() + ": " + brazilianCoffeWithMilk.getPrice());

		CoffeAddOn brazilianCoffeWithMilkAndSugar = new Sugar(brazilianCoffeWithMilk);
		System.out.println(brazilianCoffeWithMilkAndSugar.getDescription() + ": " + brazilianCoffeWithMilkAndSugar.getPrice());

		CoffeAddOn brazilianCoffeWithMilkSugarAndCream = new Cream(brazilianCoffeWithMilkAndSugar);
		System.out.println(brazilianCoffeWithMilkSugarAndCream.getDescription() + ": " + brazilianCoffeWithMilkSugarAndCream.getPrice());
	}

}
