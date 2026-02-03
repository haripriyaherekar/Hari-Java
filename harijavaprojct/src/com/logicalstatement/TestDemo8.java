package com.logicalstatement;

import java.util.Scanner;

public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a:");
		int a =sc.nextInt();
		System.out.println("Enter value b:");
		int b =sc.nextInt();
		System.out.println("Enter symbol like + - * / %");
		String symbol = sc.next();
		int result =0;
		
		switch(symbol) {
		case "+" -> result =a  +  b;
		case "-" -> result =a - b;
		case "*" -> result =a * b;
		case "/" -> result =a / b;
		default -> System.out.println("invalid");
		}

	}
	
}
