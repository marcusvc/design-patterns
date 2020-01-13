package edu.marcus.designpatterns.structural.adapter;

public class XML2JSONAdapter extends XMLDocument {
	
	private JSONDocument jsonDocument;
	
	public XML2JSONAdapter(JSONDocument jsonDocument) {
		this.jsonDocument = jsonDocument;
	}
	
	@Override
	public void print() {
		jsonDocument.print();
	}

}
