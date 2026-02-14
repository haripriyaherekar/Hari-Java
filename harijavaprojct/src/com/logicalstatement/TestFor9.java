package com.logicalstatement;

import java.util.Scanner;

//wap to find the given number is perfect number or not?
	//input:6
		//output:true--->1+2+3=6
		//input:24
			//output:false
public class TestFor9 {
	static void perfno(int n) {
		for(int i=1;i<=n/2;i++) {
			if(n % i ==0) {
				int sum=0;
				sum=sum+i;
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value");
		int n =sc.nextInt();
		int sum=0;
		
		perfno(n);
		
		if(sum == n) {
			System.out.println("given number is perfect");
		}else {
			System.out.println("given number is  not perfect");
		}sc.close();
	}
	
}
