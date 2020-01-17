package edu.marcus.designpatterns.behavioral.visitor;

public class HtmlOrderVisitor implements OrderVisitor {
	
	private String html;
	
	public String getHtml() {
		return html;
	}

	@Override
	public void visit(SimpleOrder order) {
		html = String.format("<p>Simple order total cost: %s</p>", order.getCost());
	}

	@Override
	public void visit(ComplexOrder order) {
		html = String.format("<p>Complex order total cost: %s</p>", order.getCostOne() + order.getCostTwo());
	}

}
