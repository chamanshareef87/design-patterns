package com.creational.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		//using builder to get the object in a single line of code
		//without any inconsistent state or arguments management issues
		
		Computer computer = new Computer.
				ComputerBuilder("500GB", "2gb")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.build();
		
		System.out.println(computer.getHDD());
		System.out.println(computer.getRAM());
		System.out.println("============================================");
		
		Computer_v1 computer_v1 = new Computer_v1.
				ComputerBuilder("500GB", "2gb")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.build();
		
		System.out.println(computer_v1.getHDD());
		System.out.println(computer_v1.getRAM());
		
	}

}
