package com.logicalstatement;

import java.util.Scanner;

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter T-shirts");
		int ts =sc.nextInt();
		
		switch(ts) {
		case 36 -> System.out.println("T-Shirts size is samll:");
		case 38 -> System.out.println("T-Shirts size is medium:");
		case 40 -> System.out.println("T-Shirts size is long;");
		case 42 -> System.out.println("T-Shirts size is xl:");
		case 46 -> System.out.println("T-Shirts size is xxl:");
		case 48 -> System.out.println("T-Shirts size is xxxl:");
		default ->System.out.println("not available");
		}
		sc.close();
	}

}
