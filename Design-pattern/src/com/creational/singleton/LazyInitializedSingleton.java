package com.creational.singleton;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {
		
	}
	
	public static LazyInitializedSingleton getInstance() {
		
		if(null==instance) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
	
	/*
	 * The above implementation works fine incase of single threaded environment but
	 * when it comes to multithreaded systems, it can cause issues if multiple
	 * threads are inside the if loop at the same time
	 */
	
}
