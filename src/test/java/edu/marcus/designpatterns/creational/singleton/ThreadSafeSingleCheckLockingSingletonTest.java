package edu.marcus.designpatterns.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreadSafeSingleCheckLockingSingletonTest {

	@Test
	public void testGetInstance() {
		ThreadSafeSingleCheckLockingSingleton instance1 = ThreadSafeSingleCheckLockingSingleton.getInstance();
		ThreadSafeSingleCheckLockingSingleton instance2 = ThreadSafeSingleCheckLockingSingleton.getInstance();
		assertEquals(instance1, instance2);
	}

}
