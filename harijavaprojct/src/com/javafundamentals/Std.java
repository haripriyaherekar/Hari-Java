package com.javafundamentals;
import java.util.Scanner;


public class Std {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter marks:");
		int marks =sc.nextInt();
		System.out.println("enter attedance percentage :");
		float percentage =sc.nextFloat();
		sc.close();

	if(marks>50 && marks<100 && percentage>80 &&  percentage<100) {
		System.out.println("student is eligible for scholarship for 20000");
	}else {
		System.out.println("student is not eligible for scholarship");
	}
}
}
