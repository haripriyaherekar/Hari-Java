package com.logicalstatement;

import java.util.Scanner;

//wap to check the given number is armstrong or not?
public class WhileArmstrong2 {
	static boolean isarmstrong(int n) {
		boolean status = false;
		String S = Integer.toString(n);
		int digitcount = S.length();
		int temp = n;
		int r = 0;
		int sump = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sump = (int) (sump + Math.pow(r, digitcount));
		}

		if (temp == sump) {
			status = true;
		}
		return status;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value :");
		int n = sc.nextInt();
		boolean status = isarmstrong(n);
		if (status) {
			System.out.println("given is armstrong");
		} else {
			System.out.println("given is not aarmstrong");

		}
		sc.close();

	}
	
}
