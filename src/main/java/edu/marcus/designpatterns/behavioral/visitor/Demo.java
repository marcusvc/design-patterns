package edu.marcus.designpatterns.behavioral.visitor;

public class Demo {
	
	public static void main(String[] args) {
		SimpleOrder simpleOrder = new SimpleOrder(5);
		ComplexOrder complexOrder = new ComplexOrder(4, 3);
		
		HtmlOrderVisitor htmlOrderVisitor = new HtmlOrderVisitor();
		JsonOrderVisitor jsonOrderVisitor = new JsonOrderVisitor();
		
		simpleOrder.accept(htmlOrderVisitor);
		System.out.println(htmlOrderVisitor.getHtml());
		
		simpleOrder.accept(jsonOrderVisitor);
		System.out.println(jsonOrderVisitor.getJson());
		
		complexOrder.accept(htmlOrderVisitor);
		System.out.println(htmlOrderVisitor.getHtml());
		
		complexOrder.accept(jsonOrderVisitor);
		System.out.println(jsonOrderVisitor.getJson());
		
		// One year later you need a discount visitor
		// and there is no need to change your model
	}

}
