package com.logicalstatement;

import java.util.Scanner;

public class Fact {
	static boolean findfact(int n) {
		boolean status =false;
		
		int r = 0;
		int sum = 0;
		int temp = n;
		

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			int f=1;
			
			while (r >= 1) {
				f = f * r;
				r--;
			}
			sum = sum + f;
			
		}
		return temp==sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter series");
		int n = sc.nextInt();

		boolean status = findfact(n);
		if (status) {
			System.out.println("number is strong");
		} else {
			System.out.println("number is not strong");
		}
		sc.close();
	}

}
