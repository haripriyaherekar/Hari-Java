package com.logicalstatement;
import java.util.Scanner;
public class TestDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age:");
		int age = sc.nextInt();

		System.out.println("Passed driving test? (true/false)");
		boolean test = sc.nextBoolean();

		if (age <= 21 && test) {
		    System.out.println("License Approved");
		} else {
		    System.out.println("License Rejected");
		}sc.close();
	}

}
