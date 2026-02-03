package com.logicalstatement;
import java.util.Scanner;

public class TestDemo1 {


//wap  a prgm for eligibility for matrimony site
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name:");
		String name =sc.next();
		System.out.println("Enter your salary :");
		Double salary=sc.nextDouble();
		System.out.println("Enter your asserts :");
		Double asserts = sc.nextDouble();
		System.out.println("Enter your adderss:");
		String address = sc.next();
		
	
		if(salary >=200000.00 && asserts >= 500000000.00) {
			System.out.println("oh ok we will proceed");
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if(age >=27 && age <= 29) {
			System.out.println("okay we will continue");
		}
		
		System.out.println("Enter your height:");
		double height = sc.nextDouble();
		if(height >= 5.5 && height <=6.0) {
			System.out.println("okay will check");
		}
		System.out.println("Enter your weight:");
		Double weight= sc.nextDouble();
		if(weight >=60 && weight<= 80){
			System.out.println("oh okay");
		}
			
		else {
			System.out.println("sorry your profile is not matching");
		}
		
		}sc.close();
	}
}

	


