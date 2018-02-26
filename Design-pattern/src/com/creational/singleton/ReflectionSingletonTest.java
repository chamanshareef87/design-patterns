package com.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] agrs) {
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance2 = null;
		
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getConstructors();
			System.out.println(constructors.length);
			for(Constructor constructor : constructors) {
				System.out.println(constructor);
				//Bellow code will break the singleton pattern
				constructor.setAccessible(true);
				instance2 = (EagerInitializedSingleton)constructor.newInstance();
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Reflection instance1:"+instance1.hashCode());
		System.out.println("Reflection instance2:"+instance2.hashCode());
			
	}
	
	
}
