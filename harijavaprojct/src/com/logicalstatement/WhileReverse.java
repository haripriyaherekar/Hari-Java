package com.logicalstatement;

import java.util.Scanner;

public class WhileReverse {
	//wap to print reverse of given number and palindrome
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value :");
		int n =sc.nextInt();
		int r=0;
		int rev=0;
		int temp=n;
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		System.out.println("reverse:"+rev);
		sc.close();
	
	if(rev == temp) {
		System.out.println("given no is palindrome");
	}else {
		System.out.println("given no is not a palindrome");
	}
	}
}
