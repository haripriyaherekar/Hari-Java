package com.javafundamentals;
import java.util.Scanner;

public class Testop3 {
	double a;
	double b;
	double c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a:");
		double a =sc.nextInt();
		System.out.println("enter b:");
		double b =sc.nextInt();
		System.out.println("enter c:");
		double c =sc.nextInt();
		
		System.out.println("*********");
		System.out.println(a++ + b-- + --a);
		System.out.println(b++ + a++ + --a + --b + ++a + ++b - --a - a-- - a++);
		System.out.println(a++ + --a + --b + ++a + ++b );
		System.out.println(b++ - a-- - --a - b++ + a++ - --a + ++b + ++a);
		
		
		System.out.println("************");
		System.out.println(a < b);//22,44 true
		System.out.println(a > b);// 22,44 false
		System.out.println(c > b);//55,44 true
		System.out.println(a < c);//22,55 true
		System.out.println( c< b);// 55,44 false
		System.out.println(b < c);//44,55 true
		sc.close();
		
		
	}

}
