package edu.marcus.designpatterns.behavioral.command;

public class Client {
	
	public static void main(String[] args) {
		// client creates a order
		Order order = new Order(new Food("Burrito"));
		
		// client gives its order to the waiter
		Waiter waiter = new Waiter(order);
		
		//waiter executes client's order
		waiter.execute();
		
		// client creates a new order
		order = new Order(new Food("Feijoada"));
		
		// client gives its new order to the waiter
		waiter = new Waiter(order);
		
		//waiter executes client's new order
		waiter.execute();
		
		// client creates a new order
		order = new Order(new Food("Kung Pao Chicken"));
		
		// client gives its new order to the waiter
		waiter = new Waiter(order);
		
		//waiter executes client's new order
		waiter.execute();
	}

}
