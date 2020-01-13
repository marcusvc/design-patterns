package edu.marcus.designpatterns.structural.adapter;

public class JSONPrinter {
	
	public void print(JSONDocument document) {
		System.out.println("I'm a JSON printer printing a...");
		document.print();
	}

}
