package com.creational.abstractfactory;

import com.creational.factorymethod.Computer;
import com.creational.factorymethod.PC;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}



	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}

}
