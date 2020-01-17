package edu.marcus.designpatterns.behavioral.visitor;

public interface OrderVisitor {
	void visit(SimpleOrder order);
	void visit(ComplexOrder order);
}
