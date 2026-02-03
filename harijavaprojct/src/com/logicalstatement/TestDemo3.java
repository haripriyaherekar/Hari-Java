package com.logicalstatement;
import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your marks percentage");
		double marks =sc.nextDouble();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(marks >= 70 && age <=18) {
			System.out.println("addmison confrimed");
		}else {
			System.out.println("admissiom cancled");
		}
		sc.close();
	}

}
