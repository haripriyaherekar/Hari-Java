package com.javafundamentals;

import java.util.Scanner;

public class Stdmarks {

	public static void main(String[] args) {
		Stdmarks s = new Stdmarks();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int Telugu = sc.nextInt();
		System.out.println("Enter Telugumarks:" + Telugu);
		int English = sc.nextInt();
		System.out.println("Enter English:" + English);
		int Science = sc.nextInt();
		System.out.println("Enter Science:" + Science);
		int Social = sc.nextInt();
		System.out.println("Enter Social:" + Social);
		int Hindi = sc.nextInt();
		System.out.println("Enter Hindi:" + Hindi);
		int Maths = sc.nextInt();
		System.out.println("Enter Maths:" + Maths);

		s.stdmarks(Telugu, English, Science, Social, Hindi, Maths);
		sc.close();

	}

	void stdmarks(int Telugu, int English, int Science, int Social, int Hindi, int Maths) {
		int total = Telugu + English + Science + Social + Hindi + Maths;
		avg(total);

	}

	void avg(int tm) {
		int avg = tm / 6;
		showdetails(tm, avg);
	}

	void showdetails(int total, int avg) {
		System.out.println("Total Marks:"+total);
		System.out.println("Average:"+avg);
	}

}
