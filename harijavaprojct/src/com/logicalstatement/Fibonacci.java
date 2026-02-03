package com.logicalstatement;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter series");
		int n =sc.nextInt();
		
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.println(n1+""+n2);
		for(int i=0;i<=n;i++) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			
			
		}
	}

}
