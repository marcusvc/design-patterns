package edu.marcus.designpatterns.creational.factory;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import edu.marcus.designpatterns.behavioral.command.Chef;
import edu.marcus.designpatterns.behavioral.command.Food;

public class ChefFactoryTest {
	
ByteArrayOutputStream outContent;
	
	@Before
	public void tearUp() {
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void brazilianChefTest() {
		Chef chef1 = ChefFactory.getChef(Cuisine.BRAZILIAN, new Food("Feijoada"));
		chef1.execute();
		assertEquals("Brazilian chef cooking Feijoada\n", outContent.toString());
	}

	@Test
	public void chineseChefTest() {
		Chef chef2 = ChefFactory.getChef(Cuisine.CHINESE, new Food("Kung Pao Chicken"));
		chef2.execute();
		assertEquals("Chinese chef cooking Kung Pao Chicken\n", outContent.toString());
	}

	@Test
	public void mexicanChefTest() {
		Chef chef3 = ChefFactory.getChef(Cuisine.MEXICAN, new Food("Burrito"));
		chef3.execute();
		assertEquals("Mexican chef cooking Burrito\n", outContent.toString());
	}

}
