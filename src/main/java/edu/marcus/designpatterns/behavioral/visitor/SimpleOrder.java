package edu.marcus.designpatterns.behavioral.visitor;

public class SimpleOrder implements Visitable<OrderVisitor> {
	
	private double cost;
	
	public SimpleOrder(double cost) {
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}

	@Override
	public void accept(OrderVisitor visitor) {
		visitor.visit(this);
	}
}
