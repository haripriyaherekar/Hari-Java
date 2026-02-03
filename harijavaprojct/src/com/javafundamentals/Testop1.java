package com.javafundamentals;
import java.util.Scanner;

public class Testop1 {
	int a;
	int b;

	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		Scanner sc= new Scanner(System.in);
	
	
	System.out.println("Enter a:");
	int a =sc.nextInt();
	System.out.println("Enter b:");
	int b =sc.nextInt();
	
	System.out.println(a & b);
	System.out.println(a|b);
	System.out.println(a^b);
	sc.close();
	
	
	System.out.println("********");
	System.out.println(a<<b);
	System.out.println(a>>b);
	System.out.println(b>>a);
	System.out.println(b<<a);
	System.out.println(a<<b);
	
	
	
	}

}
