package edu.marcus.designpatterns.structural.adapter;

public class XMLPrinter {
	
	public void print(XMLDocument document) {
		System.out.println("I'm a XML printer printing a...");
		document.print();
	}

}
