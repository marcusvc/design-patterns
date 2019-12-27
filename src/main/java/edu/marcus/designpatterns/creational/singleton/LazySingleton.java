package edu.marcus.designpatterns.creational.singleton;

public class LazySingleton {

	// Initialize the instance as null.
	// No eager initialization problem.
	private static LazySingleton instance = null;

	// Private constructor, so it cannot be instantiated outside this class.
	private LazySingleton() {}

	// Check if the instance is null, and if so, create the object.
	// Not thread safe
	// If two clients check if the instance is null at the same time, both will find it true
	// and both will create a new instance
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}
