package com.logicalstatement;

import java.util.Scanner;

public class ArmstrogNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n =sc.nextInt();
		int r=0;
		int temp=n;
		int sum=0;
		int product=1;
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
		}
		if(sum==temp) {
			System.out.println("The number is armstrong");
		}else {
			System.out.println("The number is not a armstrong");
		}
			
		
		sc.close();
	}
	
}
