package com.logicalstatement;

import java.util.Scanner;
//switch case 
public class TestDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value a:");
		int a =sc.nextInt();
		System.out.println("Enter value b;");
		int b =sc.nextInt();
		
		System.out.println("Enter symbol like + - * / %");
		String symbol = sc.next();
		
		switch(symbol) {
		case "+" ->{
			System.out.println("ADD");
			System.out.println(a + b);
			}
		case "-" ->{
			System.out.println("SUB");
			System.out.println(a - b);
			}
		case "*" ->{
			System.out.println("MUL");
			System.out.println(a * b);
			}
		case "/" ->{
			System.out.println("MODULES");
			System.out.println(a / b);
			}
		default -> {
			System.out.println("invalid");
		}
		}
		sc.close();
	}

}
