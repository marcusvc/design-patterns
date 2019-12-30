package edu.marcus.designpatterns.behavioral.strategy;

public class Context {
	
	private PayStrategy strategy;
	
	public void setStrategy(PayStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void processPayment(double value) {
		strategy.pay(value);
	}

}
