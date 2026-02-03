package com.javafundamentals;

class Book1{
	String bookName;
	double bookPrice;

	Book1(String bookName, double bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
}

class Auther extends Book1 {
	String autherName;
	String autherPlace;

	Auther(String autherName, String autherPlace, String bookName, double bookPrice) {
		super(bookName, bookPrice);
		this.autherName = autherName;
		this.autherPlace = autherPlace;
	}

	void display() {
		System.out.println("Name of the book:" + bookName);
		System.out.println("Price of the book:" + bookPrice);
		System.out.println("Name of the Auther:" + autherName);
		System.out.println("Name of the Place:" + autherPlace);
	}

}

public class Book {

	public static void main(String[] args) {
		Auther a = new Auther("lokesh", "Mahabubnagar", "koja", 1200.00);
		a.display();

	}
}