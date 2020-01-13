package edu.marcus.designpatterns.structural.adapter;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class JSONPrinterTest {
	
	private JSONPrinter jsonPrinter;
	ByteArrayOutputStream outContent;

	@Before
	public void setUp() throws Exception {
		jsonPrinter = new JSONPrinter();
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testPrintJSONDocument() {
		JSONDocument jsonDocument = new JSONDocument();
		jsonPrinter.print(jsonDocument);
		assertEquals("I'm a JSON printer printing a...\nJSON document\n", outContent.toString());
	}

	@Test
	public void testPrintXMLDocumentWithJSONPrinter() {
		XMLDocument xmlDocument = new XMLDocument();
		JSON2XMLAdapter json2XmlAdapter = new JSON2XMLAdapter(xmlDocument);
		jsonPrinter.print(json2XmlAdapter);
		assertEquals("I'm a JSON printer printing a...\nXML document\n", outContent.toString());
	}

}
