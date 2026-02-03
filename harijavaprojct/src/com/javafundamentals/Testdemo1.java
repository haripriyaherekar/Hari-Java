package com.javafundamentals;

public class Testdemo1 {
//no retrun with arguments
	public static void main(String[] args) {
		Testdemo1 t =new Testdemo1();
		t.addition(100,200);
		t.subtract(200,100 );
		t.division(20, 5);
		t.multiply(12,5);
		t.modules(44,7);
	}

	void addition(int a,int b) {
		System.out.println("IN addition");
		System.out.println(a+b);
	}
	void subtract(int a,int b) {
		System.out.println("IN subtract");
		System.out.println(a-b);
	}
	void division(float a,int b) {
		System.out.println("IN division");
		System.out.println(a+b);
	}
	void multiply(int a,int b) {
		System.out.println("IN mul");
		System.out.println(a*b);
	}
	void modules(int a,double b) {
		System.out.println("IN modulus");
		System.out.println(a%b);
	}
}
