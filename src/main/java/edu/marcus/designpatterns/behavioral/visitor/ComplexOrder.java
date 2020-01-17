package edu.marcus.designpatterns.behavioral.visitor;

public class ComplexOrder implements Visitable<OrderVisitor> {
	
	private double costOne;
	private double costTwo;
	
	public ComplexOrder(double costOne, double costTwo) {
		this.costOne = costOne;
		this.costTwo = costTwo;
	}
	
	public double getCostOne() {
		return costOne;
	}
	
	public double getCostTwo() {
		return costTwo;
	}

	@Override
	public void accept(OrderVisitor visitor) {
		visitor.visit(this);
	}
}
