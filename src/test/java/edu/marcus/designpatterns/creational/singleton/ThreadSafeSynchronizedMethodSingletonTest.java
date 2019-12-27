package edu.marcus.designpatterns.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.marcus.designpatterns.creational.singleton.ThreadSafeStaticFactorySingleton.Resource;

public class ThreadSafeSynchronizedMethodSingletonTest {

	@Test
	public void testGetInstance() {
		ThreadSafeSynchronizedMethodSingleton instance1 = ThreadSafeSynchronizedMethodSingleton.getInstance();
		ThreadSafeSynchronizedMethodSingleton instance2 = ThreadSafeSynchronizedMethodSingleton.getInstance();
		assertEquals(instance1, instance2);
	}

}
