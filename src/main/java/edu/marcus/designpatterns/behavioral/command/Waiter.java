package edu.marcus.designpatterns.behavioral.command;

public class Waiter implements Command {
	
	private Order order;

	public Waiter(Order order) {
		this.order = order;
	}

	public void execute() {
		order.execute();
	}

}
