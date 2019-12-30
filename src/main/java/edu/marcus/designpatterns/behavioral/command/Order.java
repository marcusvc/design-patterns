package edu.marcus.designpatterns.behavioral.command;

/**
 * Order implements Command but acts like a Strategy,
 * delegating the execution of it's command method
 * to another class
 */
public class Order implements Command {
	
	private Food food;
	
	public Order(Food food) {
		this.food = food;
	}

	public void execute() {
		new Chef(food).execute();
	}
	
	public Food getFood() {
		return food;
	}

}
