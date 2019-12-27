package edu.marcus.designpatterns.behavioral.command;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class CommandTest {
	
	ByteArrayOutputStream outContent;
	
	@Before
	public void tearUp() {
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void cookingBurrito() {
		// client creates a order
		Order order = new Order(new Food("Burrito"));
		// client gives its order to the waiter
		Waiter waiter = new Waiter(order);
		// waiter executes client's order
		waiter.execute();
		assertEquals("Cooking Burrito\n", outContent.toString());
	}
	
	@Test
	public void cookingFeijoada() {
		// client creates a new order
		Order order = new Order(new Food("Feijoada"));
		// client gives its new order to the waiter
		Waiter waiter = new Waiter(order);
		// waiter executes client's new order
		waiter.execute();
		assertEquals("Cooking Feijoada\n", outContent.toString());
	}
	
	@Test
	public void cookingKungPaoChicken() {
		// client creates a new order
		Order order = new Order(new Food("Kung Pao Chicken"));
		// client gives its new order to the waiter
		Waiter waiter = new Waiter(order);
		// waiter executes client's new order
		waiter.execute();
		assertEquals("Cooking Kung Pao Chicken\n", outContent.toString());
	}

}
