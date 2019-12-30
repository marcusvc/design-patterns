package edu.marcus.designpatterns.behavioral.strategy;

public class Cart {
	
	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new PayByCash());
		context.processPayment(5.1);

		context.setStrategy(new PayByCreditCard());
		context.processPayment(7.3);

		context.setStrategy(new PayByPayPal());
		context.processPayment(9.5);
	}

}
