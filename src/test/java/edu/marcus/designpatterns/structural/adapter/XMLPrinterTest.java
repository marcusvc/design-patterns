package edu.marcus.designpatterns.structural.adapter;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class XMLPrinterTest {
	
	private XMLPrinter xmlPrinter;
	ByteArrayOutputStream outContent;

	@Before
	public void setUp() throws Exception {
		xmlPrinter = new XMLPrinter();
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testPrintXMLDocument() {
		XMLDocument xmlDocument = new XMLDocument();
		xmlPrinter.print(xmlDocument);
		assertEquals("I'm a XML printer printing a...\nXML document\n", outContent.toString());
	}

	@Test
	public void testPrintJSONDocumentWithXMLPrinter() {
		JSONDocument jsonDocument = new JSONDocument();
		XML2JSONAdapter xml2JsonAdapter = new XML2JSONAdapter(jsonDocument);
		xmlPrinter.print(xml2JsonAdapter);
		assertEquals("I'm a XML printer printing a...\nJSON document\n", outContent.toString());
	}

}
