package edu.marcus.designpatterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.marcus.designpatterns.creational.singleton.ThreadSafeStaticFactorySingleton.Resource;

public class ThreadSafeStaticFactorySingletonTest {

	@Test
	public void testGetInstance() {
		Resource instance1 = ThreadSafeStaticFactorySingleton.getInstance();
		Resource instance2 = ThreadSafeStaticFactorySingleton.getInstance();
		assertEquals(instance1, instance2);
	}

}
