package com.creational.abstractfactory;

import com.creational.factorymethod.Computer;
import com.creational.factorymethod.Server;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	
	public ServerFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}


	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}

}
