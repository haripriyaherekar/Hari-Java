package com.logicalstatement;

import java.util.Scanner;

public class TestFor7 {
//wap to print divisor or factror of a given number---->method 1
	//input:10
	//output:1,2,5,10
	//input:28
		//output:1,2,4,7,14,28
	//input:16
		//output:1,2,4,8,16
	//input:24
		//output:1,2,3,4,6,8,12,24
	
	public static void main(String[] args) {
		System.out.println("main method stratred");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n % i==0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
