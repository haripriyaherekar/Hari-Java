package com.logicalstatement;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your six subject marks:");
		int marks =sc.nextInt();
		
		
		
		if(marks >= 540 && marks<= 600) {
			System.out.println("Grade:A+");
		}else if(marks >= 540 && marks<= 600) {
		System.out.println("Grade:A+");
		}else if(marks >= 450 && marks<= 539) {
		System.out.println("Grade:A");
		}else if(marks >= 360 && marks<= 449) {
		System.out.println("Grade:B");
		}else if(marks >= 270 && marks<= 359) {
		System.out.println("Grade:C"); 
		}else {
			System.out.println("Grade:Fail");
		}sc.close();
		}

}
