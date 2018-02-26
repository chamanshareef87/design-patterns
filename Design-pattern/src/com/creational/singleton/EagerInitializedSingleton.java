package com.creational.singleton;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	//Private constructor to avoid client application to use constructor
	private EagerInitializedSingleton() {
		
	}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
	
	
	/*
	 * If your singleton class is not using a lot of resources, this is the approach
	 * to use
	 */
	
}
