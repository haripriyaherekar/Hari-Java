package com.logicalstatement;

import java.util.Scanner;

public class WhileCountDig {
	//wap to find count of sum of it's digits
	//input:123		input:456234
	//output:3	 output:	6		
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value :");
		int n =sc.nextInt();
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println("count:"+count);
		sc.close();
	}

}
