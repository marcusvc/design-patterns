package edu.marcus.designpatterns.behavioral.visitor;

public class DefaultDiscountOrderVisitor implements OrderVisitor {

	private double costAfterDiscount;

	public double getCostAfterDiscount() {
		return costAfterDiscount;
	}

	@Override
	public void visit(SimpleOrder order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ComplexOrder order) {
		// TODO Auto-generated method stub

	}

}
