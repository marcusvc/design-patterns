package edu.marcus.designpatterns.creational.singleton;

public class ThreadSafeSynchronizedMethodSingleton {

	// Initialize the instance as null.
	// No eager initialization problem.
	private static ThreadSafeSynchronizedMethodSingleton instance = null;

	// private constructor, so it cannot be instantiated outside this class.
	private ThreadSafeSynchronizedMethodSingleton() {
	}

	/*
	 * With early versions of the JVM, synchronizing the whole method was generally
	 * advised against for performance reasons. But synchronized performance has
	 * improved a lot in newer JVMs, so this is now a preferred solution.
	 */
	public static synchronized ThreadSafeSynchronizedMethodSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSynchronizedMethodSingleton();
		}
		return instance;
	}

}
