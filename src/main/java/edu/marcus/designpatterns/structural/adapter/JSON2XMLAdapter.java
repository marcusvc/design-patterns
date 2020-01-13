package edu.marcus.designpatterns.structural.adapter;

public class JSON2XMLAdapter extends JSONDocument {
	
	private XMLDocument xmlDocument;
	
	public JSON2XMLAdapter(XMLDocument xmlDocument) {
		this.xmlDocument = xmlDocument;
	}
	
	@Override
	public void print() {
		xmlDocument.print();
	}

}
