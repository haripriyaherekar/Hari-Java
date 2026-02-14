package com.logicalstatement;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.println(n1+""+n2);
		
		while(n!=0) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
		sc.close();
	}
}
