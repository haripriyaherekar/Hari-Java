package com.logicalstatement;

import java.util.Scanner;

//wap tp print sum of it's digits
//input:123		input:456
//output:6		output:	15				
public class WhileSumDigit {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value :");
		int n =sc.nextInt();
		int r=0;
		int sum=0;
		
		while(n !=0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println("sum of value:"+sum);
		sc.close();
	}

}
