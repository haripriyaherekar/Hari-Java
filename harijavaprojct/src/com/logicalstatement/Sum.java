package com.logicalstatement;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		int product = 1;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
			product = product * r;

		}

		if (sum == product) {
			System.out.println("spy");
		} else {
			System.out.println("not spy");
		}
		sc.close();
	}

}
