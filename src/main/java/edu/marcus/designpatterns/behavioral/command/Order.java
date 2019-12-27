package edu.marcus.designpatterns.behavioral.command;

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
