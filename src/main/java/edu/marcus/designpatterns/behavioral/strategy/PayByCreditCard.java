package edu.marcus.designpatterns.behavioral.strategy;

public class PayByCreditCard implements PayStrategy {

	public void pay(double value) {
		System.out.println("Paying with credit card the amount of " + value);
	}

}
