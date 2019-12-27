package edu.marcus.designpatterns.creational.singleton;

public class EagerSingleton {

	// Create an instance of the class during calls loading.
	// It's a drawback if this class is never used by the application.
	// Eager initialization problem.
	private static EagerSingleton instance = new EagerSingleton();

	// Private constructor, so it cannot be instantiated outside this class.
	private EagerSingleton() {}

	// Get the only instance of the object created.
	public static EagerSingleton getInstance() {
		return instance;
	}

}
