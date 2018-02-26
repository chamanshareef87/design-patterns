package com.creational.singleton;

import javax.management.RuntimeErrorException;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		
	}
	
	//Static block initialization for handling exception
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured while creating singleton instance.");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
}
