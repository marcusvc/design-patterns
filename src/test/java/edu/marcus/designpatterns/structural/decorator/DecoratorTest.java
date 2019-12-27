package edu.marcus.designpatterns.structural.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void executeTest() {
		Coffe brazilianCoffe = new BrazilianCoffe();
		assertEquals("Brazilian coffe: 4.5",
				brazilianCoffe.getDescription() + ": " + brazilianCoffe.getPrice());

		CoffeAddOn brazilianCoffeWithMilk = new Milk(brazilianCoffe);
		assertEquals("Brazilian coffe with Milk: 5.6",
				brazilianCoffeWithMilk.getDescription() + ": " + brazilianCoffeWithMilk.getPrice());

		CoffeAddOn brazilianCoffeWithMilkAndSugar = new Sugar(brazilianCoffeWithMilk);
		assertEquals("Brazilian coffe with Milk with Sugar: 6.3999999999999995",
				brazilianCoffeWithMilkAndSugar.getDescription() + ": " + brazilianCoffeWithMilkAndSugar.getPrice());

		CoffeAddOn brazilianCoffeWithMilkSugarAndCream = new Cream(brazilianCoffeWithMilkAndSugar);
		assertEquals("Brazilian coffe with Milk with Sugar with Cream: 7.8999999999999995",
				brazilianCoffeWithMilkSugarAndCream.getDescription() + ": " + brazilianCoffeWithMilkSugarAndCream.getPrice());
		
		Coffe colombianCoffe = new ColombianCoffe();
		assertEquals("Colombian coffe: 4.0",
				colombianCoffe.getDescription() + ": " + colombianCoffe.getPrice());
		
		Coffe handGroundCoffe = new HandGroundCoffe();
		assertEquals("Hand ground coffe: 3.8",
				handGroundCoffe.getDescription() + ": " + handGroundCoffe.getPrice());
	}

}
