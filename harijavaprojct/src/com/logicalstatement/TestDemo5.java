package com.logicalstatement;
import java.util.Scanner;
public class TestDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter jno to get info");
		int jno =sc.nextInt();
		switch(jno) {
		case 45:
			System.out.println("RS");
			System.out.println("hitman");
			break;
		}
		switch(jno) {
		case 7:
			System.out.println("MSD");
			System.out.println("thalaa");
			break;
		}
		switch(jno) {
		case 1:
			System.out.println("KL");
			System.out.println("wicket keeper");
			break;
		}
		switch(jno) {
		case 4:
			System.out.println("AB");
			System.out.println("kateramaa");
			break;
		}
		switch(jno) {
		default:
			System.out.println("unknow player");
			break;
			
		}
	}
	
}
