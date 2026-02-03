package com.javaintro;

public class Customer {
static {
	Customer c = new Customer();
	System.out.println("static block 1 called");
}
static {
	System.out.println("main method");
}
{
	System.out.println("welcome instance block called");
}
	public static void main(String[] args) {
		
		

	}

}
