package com.logicalstatement;
import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter monthly income:");
		double income = sc.nextDouble();

		System.out.println("Enter credit score:");
		int score = sc.nextInt();

		if (income >= 30000 && score >= 750) {
		    System.out.println("Loan Approved");
		} else {
		    System.out.println("Loan Rejected");
		}
		sc.close();
	}
	
}
