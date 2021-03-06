package edu.marcus.designpatterns.behavioral.command;

/**
 * Chef is the class how really know how to execute
 * the method defined by the Command interface
 */
public class Chef implements Command {
	
	private Food food;
	
	public Chef(Food food) {
		this.food = food;
	}

	public Food getFood() {
		return food;
	}

	public void execute() {
		System.out.println("Cooking " + food.getDescription());
	}
	
}
