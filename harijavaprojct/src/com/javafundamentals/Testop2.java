package com.javafundamentals;

public class Testop2 {

	public static void main(String[] args) {
		System.out.println("main method started!");
		long a =12;
		long b=23;
		
		
		System.out.println(a & b);
		System.out.println(a ^ b);
		System.out.println("************");
		System.out.println(--a);//2
		System.out.println(++a);//3
		System.out.println(--a);//3
		System.out.println(a++);//2
		System.out.println("value A:"+a);
		
		System.out.println("*********");
		System.out.println(b++);//4
		System.out.println(--b);//4
		System.out.println(++b);//5
		System.out.println(b--);//4
	
		System.out.println("value B:"+b);
		System.out.println(a++ - b++ + --a + b++ + --a + --b);
		System.out.println(b++ + a++ + --a + --b + ++a + ++b - --a - a-- - a++);
		System.out.println(b++ - a-- - --a - b++ + a++ - --a + ++b + ++a);

	}

}
