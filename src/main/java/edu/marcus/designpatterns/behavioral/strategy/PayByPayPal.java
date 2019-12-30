package edu.marcus.designpatterns.behavioral.strategy;

public class PayByPayPal implements PayStrategy {

	public void pay(double value) {
		System.out.println("Paying with PayPal the amount of " + value);
	} 

}
