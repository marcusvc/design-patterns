package edu.marcus.designpatterns.structural.adapter;

public class Demo {
	
	public static void main(String[] args) {
		
		XMLDocument xmlDocument = new XMLDocument();
		XMLPrinter xmlPrinter = new XMLPrinter();
		xmlPrinter.print(xmlDocument);
		
		JSONDocument jsonDocument = new JSONDocument();
		JSONPrinter jsonPrinter = new JSONPrinter();
		jsonPrinter.print(jsonDocument);
		
		XML2JSONAdapter xml2jsonAdapter = new XML2JSONAdapter(jsonDocument);
		xmlPrinter.print(xml2jsonAdapter);
		
		JSON2XMLAdapter json2xmlAdapter = new JSON2XMLAdapter(xmlDocument);
		jsonPrinter.print(json2xmlAdapter);
		
	}

}
