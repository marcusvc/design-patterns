package edu.marcus.designpatterns.behavioral.command;

/**
 * Waiter implements Command but acts like a Strategy,
 * delegating the execution of it's command method
 * to another class
 */
public class Waiter implements Command {
	
	private Order order;

	public Waiter(Order order) {
		this.order = order;
	}

	public void execute() {
		order.execute();
	}

}
