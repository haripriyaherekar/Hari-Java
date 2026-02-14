package com.logicalstatement;

import java.util.Scanner;

public class TestLPDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number:");
		int n =sc.nextInt();
		
		while(n>=10) {
			System.out.println(n);
			int sum=0;
			int r=0;
			
			while(n>0) {
				r=n%10;
				n=n/10; 
				sum=sum+r;
			}  
			n=sum;
		}
		if(n==1) {
			System.out.println("given num is a magic:");
		}else {
			System.out.println("given num is not a magic:");
		}
		sc.close();

			}	
	}


