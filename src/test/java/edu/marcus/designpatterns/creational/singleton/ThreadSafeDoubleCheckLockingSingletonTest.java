package edu.marcus.designpatterns.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreadSafeDoubleCheckLockingSingletonTest {

	@Test
	public void testGetInstance() {
		ThreadSafeDoubleCheckLockingSingleton instance1 = ThreadSafeDoubleCheckLockingSingleton.getInstance();
		ThreadSafeDoubleCheckLockingSingleton instance2 = ThreadSafeDoubleCheckLockingSingleton.getInstance();
		assertEquals(instance1, instance2);
	}

}
