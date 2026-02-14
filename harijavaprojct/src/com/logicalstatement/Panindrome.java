package com.logicalstatement;

import java.util.Scanner;

public class Panindrome {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter series");
		int n =sc.nextInt();
		int r=0;
		int temp=n;
		int rev=0;
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if(temp==rev) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("given number is not a palindrome");
		}
	}

}
