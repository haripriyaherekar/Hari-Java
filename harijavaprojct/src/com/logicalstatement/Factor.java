package com.logicalstatement;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		System.out.println("main method");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value:");
		int n = sc.nextInt();
		int temp = n;
		int r = 0;
		int sum = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			int f = 1;
			while (r >= 1) {
				
				f = f * r;
				r--;
			}
			sum = sum + f;
		}

		if (sum == temp) {
			System.out.println("number is strong");
		} else {
			System.out.println("number is not strong");
		}
		sc.close();

	}
}
