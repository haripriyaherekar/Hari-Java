package com.logicalstatement;

import java.util.Scanner;

public class TestDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter series");
		int n =sc.nextInt();
		int r =0;
		int rev=0;
		int temp=n;
	
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		System.out.println("reverse number:"+rev);
		if(rev==temp) {
			System.out.println("the given is palindrone");
		}else {
			System.out.println("the given is not a palindrone");
		}
	}
	
	}
	

