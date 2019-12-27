package edu.marcus.designpatterns.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class LazySingletonTest {

	@Test
	public void testGetInstance() {
		LazySingleton instance1 = LazySingleton.getInstance();
		LazySingleton instance2 = LazySingleton.getInstance();
		assertEquals(instance1, instance2);
	}

}
