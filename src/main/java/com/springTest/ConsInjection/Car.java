package com.springTest.ConsInjection;

public class Car {
	private int price;
	private String carName;
	private int modelNumber;

	public Car(double price, String carName, int modelNumber, Engine engine) {
		System.out.println("double constructor..");
		this.price = (int) price;
		this.carName = carName;
		this.modelNumber = modelNumber;
		this.engine = engine;
	}

	public Car(String price, String carName, int modelNumber, Engine engine) {
		System.out.println("string constructor..");
		this.price = Integer.parseInt(price);
		this.carName = carName;
		this.modelNumber = modelNumber;
		this.engine = engine;
	}

	public Car(int price, String carName, int modelNumber, Engine engine) {
		super();
		System.out.println("int constructor..");
		this.price = price;
		this.carName = carName;
		this.modelNumber = modelNumber;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + carName + ", modelNumber=" + modelNumber + ", engine=" + engine
				+ "]";
	}

	private Engine engine;
}
