package com.creational.abstractfactory;

import com.creational.factorymethod.Computer;

public class ComputerFactoryv1 {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
	
}
