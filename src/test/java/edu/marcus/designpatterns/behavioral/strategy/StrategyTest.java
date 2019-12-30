package edu.marcus.designpatterns.behavioral.strategy;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class StrategyTest {

	private ByteArrayOutputStream outContent;
	private Context context;

	@Before
	public void tearUp() {
		context = new Context();
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void payByCashTest() {
		context.setStrategy(new PayByCash());
		context.processPayment(5.1);
		assertEquals("Paying with cash the amount of 5.1\n", outContent.toString());
	}

	@Test
	public void payByCreditCardTest() {
		context.setStrategy(new PayByCreditCard());
		context.processPayment(7.3);
		assertEquals("Paying with credit card the amount of 7.3\n", outContent.toString());
	}

	@Test
	public void payByPayPalTest() {
		context.setStrategy(new PayByPayPal());
		context.processPayment(9.5);
		assertEquals("Paying with PayPal the amount of 9.5\n", outContent.toString());
	}

}
