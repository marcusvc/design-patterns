package edu.marcus.designpatterns.creational.singleton;

public class ThreadSafeStaticFactorySingleton {
	
	// Private constructor, so it cannot be instantiated outside this class.
	private ThreadSafeStaticFactorySingleton() {}

	public static Resource getInstance() {
		return ThreadSafeStaticFactorySingleton.ResourceHolder.resource;
	}

	private static class ResourceHolder {
		public static final Resource resource = new Resource(); // Inner static classes are guaranteed to load lazily.
	}

	static class Resource {
		// Resource that must be singleton
	}

}
