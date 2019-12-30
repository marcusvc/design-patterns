package edu.marcus.designpatterns.behavioral.strategy;

public class PayByCash implements PayStrategy {

	public void pay(double value) {
		System.out.println("Paying with cash the amount of " + value);
	}

}
