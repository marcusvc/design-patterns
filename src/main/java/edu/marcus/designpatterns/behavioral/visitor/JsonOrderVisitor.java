package edu.marcus.designpatterns.behavioral.visitor;

public class JsonOrderVisitor implements OrderVisitor {
	
	private String json;
	
	public String getJson() {
		return json;
	}

	@Override
	public void visit(SimpleOrder order) {
		json = String.format("{simple_order:{total_cost:%s}}", order.getCost());
		
	}

	@Override
	public void visit(ComplexOrder order) {
		json = String.format("{complex_order:{total_cost:%s}}", order.getCostOne() + order.getCostTwo());
		
	}

}
