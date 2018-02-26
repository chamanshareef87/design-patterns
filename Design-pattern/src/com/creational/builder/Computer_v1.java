package com.creational.builder;

public class Computer_v1 {

	//required parameters
	private String HDD="hdd from computer_v1";
	private String RAM="ram from computer_v1";
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return this.HDD;
	}
	
	public String getRAM() {
		return this.RAM;
	}
	
	private Computer_v1(ComputerBuilder builder) {
		this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;

		System.out.println("from computer_v1:"+this.HDD);
		System.out.println("from computer_v1:"+this.RAM);
		System.out.println("from computer_v1:"+this.isGraphicsCardEnabled);
		System.out.println("from computer_v1:"+this.isBluetoothEnabled);

	}

	public static class ComputerBuilder{
		
		//required parameters
		private String HDD="hdd from builder";
		private String RAM="ram from builder";
		
		//optional parameters
		private boolean isGraphicsCardEnabled=false;
		private boolean isBluetoothEnabled=false;
		
		public ComputerBuilder(String hdd, String ram) {
			this.HDD=hdd;
			this.RAM=ram;
			System.out.println("from builder:"+this.HDD);
			System.out.println("from builder:"+this.RAM);
			System.out.println("from builder:"+this.isGraphicsCardEnabled);
			System.out.println("from builder:"+this.isBluetoothEnabled);
		}
		
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicsCardEnabled=isGraphicCardEnabled ;
			System.out.println("from builder::"+this.isGraphicsCardEnabled);
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			System.out.println("from builder:"+this.isBluetoothEnabled);
			return this;
		}
		
		public Computer_v1 build() {
			return new Computer_v1(this);
		}
	}
	
}

