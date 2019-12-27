package edu.marcus.designpatterns.creational.singleton;

/**
 * Don't do Double-check locking
 * https://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 */
@Deprecated
public class ThreadSafeDoubleCheckLockingSingleton {

	// Initialize the instance as null.
	// No eager initialization problem.
	private static ThreadSafeDoubleCheckLockingSingleton instance = null;

	// private constructor, so it cannot be instantiated outside this class.
	private ThreadSafeDoubleCheckLockingSingleton() {
	}

	/*
	 * It does not work reliably in a platform-independent manner without additional
	 * synchronization for mutable instances of anything other than float or int.
	 * Using double-checked locking for the lazy initialization of any other type of
	 * primitive or mutable object risks a second thread using an uninitialized or
	 * partially initialized member while the first thread is still creating it, and
	 * crashing the program.
	 * 
	 * There are multiple ways to fix this. The simplest one is to simply not use
	 * double checked locking at all, and synchronize the whole method instead. With
	 * early versions of the JVM, synchronizing the whole method was generally
	 * advised against for performance reasons. But synchronized performance has
	 * improved a lot in newer JVMs, so this is now a preferred solution. If you
	 * prefer to avoid using synchronized altogether, you can use an inner static
	 * class to hold the reference instead. Inner static classes are guaranteed to
	 * load lazily.
	 */
	public static ThreadSafeDoubleCheckLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeDoubleCheckLockingSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeDoubleCheckLockingSingleton();
				}
			}
		}
		return instance;
	}

}
