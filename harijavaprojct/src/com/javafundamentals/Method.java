package com.javafundamentals;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {

		Method m = new Method();
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter value:");
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("add:" + (a + b));

//		subtraction
//		System.out.println("Enter a1 ");
//		int a1 = sc.nextInt();
		int a1 = m.addition(a, b);
		int r = a1;

		System.out.println("Enter b1");
		int b1 = sc.nextInt();
		System.out.println("sub:" + (r- b1));

//		multiply
		int a2 = m.subtract(r, b);
		int t = a2; 
//	    System.out.println("Enter a2 ");
//		int a2 = sc.nextInt();
		
		System.out.println("Enter b2");
		int b2 = sc.nextInt();
		System.out.println("mul:" + (t * b2));

		m.addition(a, b);
		m.subtract(a1, b1);
		m.multiply(a2, b2);

		sc.close();

	}

	int addition(int a, int b) {
		int add = (a + b);
		return add;

	}

	int subtract(int r, int b) {
		int sub = (r - b);
		return sub;
	}

	int multiply(int t, int b2) {
		int mul = (t * b2);
		return mul;
	}

}
