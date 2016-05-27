package com.mahesh.abstraction;

abstract class AbstractVehicle {
	public abstract int speed();

	public abstract int milage();

	public abstract int brand();

	public void color() {
		System.out.println("i am in color");
	}

	public void engine() {
		System.out.println("i am in engine");
	}
}

class FourWheeler extends AbstractVehicle {
	public void engine() {
		System.out.println("i am in main engine");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		AbstractVehicle dsds = new FourWheeler();
		dsds.color();
		dsds.speed();
		dsds.engine();
	}

	@Override
	public int speed() {
		System.out.println("i am in speed");
		return 0;
	}

	public int milage() {
		System.out.println("i am in milage");
		return 0;
	}

	@Override
	public int brand() {
		System.out.println("i am in brand");
		return 0;
	}
}