package com.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
		System.out.println("Eager instance1:"+instance1.hashCode());
		System.out.println("Eager instance2:"+instance2.hashCode());
		
		
	}
	
}
