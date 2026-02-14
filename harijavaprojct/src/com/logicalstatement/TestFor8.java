package com.logicalstatement;

import java.util.Scanner;

//wap to print divisor or factror of a given number---->method 2 
	//creating with method
public class TestFor8 {
	
	static void findfactor(int n) {
		for(int i=1;i<=n/2;i++) {
			if(n % i==0) {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value");
		int n =sc.nextInt();
		
		findfactor(n);
		System.out.println("main method ended");
		sc.close();
	}

}
