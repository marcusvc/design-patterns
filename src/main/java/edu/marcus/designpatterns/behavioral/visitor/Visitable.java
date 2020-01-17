package edu.marcus.designpatterns.behavioral.visitor;

public interface Visitable<V extends OrderVisitor> {
	void accept(V visitor);
}
