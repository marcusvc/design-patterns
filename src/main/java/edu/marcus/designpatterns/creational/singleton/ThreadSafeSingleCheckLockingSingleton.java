package edu.marcus.designpatterns.creational.singleton;

@Deprecated
public class ThreadSafeSingleCheckLockingSingleton {

	// Initialize the instance as null.
	// No eager initialization problem.
	private static ThreadSafeSingleCheckLockingSingleton instance = null;

	// private constructor, so it cannot be instantiated outside this class.
	private ThreadSafeSingleCheckLockingSingleton() {}

	// check if the instance is null, within a synchronized block.
	// Now the drawback is the high cost of the synchronized block that runs on
	// every call
	public static ThreadSafeSingleCheckLockingSingleton getInstance() {
		synchronized (ThreadSafeSingleCheckLockingSingleton.class) {
			if (instance == null) {
				instance = new ThreadSafeSingleCheckLockingSingleton();
			}
		}
		return instance;
	}

}
