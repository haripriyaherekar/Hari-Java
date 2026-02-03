package com.javafundamentals;

class Vehicle {
	long registrationnumber;
	double price;

	Vehicle(long registrationnumber, double price) {
		this.registrationnumber = registrationnumber;
		this.price = price;

	}

	Vehicle(Car c, long registrationnumber) {
		this.registrationnumber = registrationnumber;
	}
}

public class Car extends Vehicle {
	String model;
	String ownername;

	Car(long registrationnumber, double price, String model, String ownername) {
		super(registrationnumber, price);
		this.model = model;
		this.price = price;

	}

	Car(Car c, String ownername, long registrationnumber) {
		super(c, registrationnumber);
		this.model = c.model;
		this.price = c.price;
		this.ownername = ownername;
		this.registrationnumber = registrationnumber;
	}

	public static void main(String[] args) {
		Car c = new Car(45678916, 200000.00, "kia", "hari");
		c.show();
		Car c1 = new Car(c, "priya", 45678917);
		c1.show();
	}

	void show() {
		System.out.println("********************Vehicle Details*******************");
		System.out.println("registrationnumber:" + registrationnumber);
		System.out.println("price:" + price);
		System.out.println("model:" + model);
		System.out.println("price:" + price);
	}
}
