package edu.marcus.designpatterns.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class EagerSingletonTest {
	
	@Test
	public void testGetInstance() {
		EagerSingleton instance1 = EagerSingleton.getInstance();
		EagerSingleton instance2 = EagerSingleton.getInstance();
		assertEquals(instance1, instance2);
	}

}
