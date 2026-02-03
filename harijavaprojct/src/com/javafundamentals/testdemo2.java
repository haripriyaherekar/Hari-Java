package com.javafundamentals;

import java.util.Scanner;

public class testdemo2 {

	public static void main(String[] args) {
		testdemo2 t1 = new testdemo2();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fullname:");
		System.out.println("Enter fname:");
		String fname = sc.next();
		System.out.println("Enter lsname:");
		String lsname = sc.next();
		System.out.println("Enter age:");
		int age = sc.nextInt();
		System.out.println("Enter weight:");
		double weight = sc.nextDouble();
		System.out.println("Enter address:");
		String address = sc.next();
		System.out.println("Enter height:");
		float height = sc.nextFloat();
		System.out.println("Enter rollno");
		int rollno = sc.nextInt();
		System.out.println("Enter clgname");
		String clgname = sc.next();
		System.out.println("Enter branch");
		String branch = sc.next();
		System.out.println("Enter marks");
		int marks = sc.nextInt();

		t1.getname(fname, lsname);
		t1.getage(age);
		t1.getweight(weight);
		t1.getaddress(address);
		t1.getheight(height);
		t1.getrollno(rollno);
		t1.getclgname(clgname);
		t1.getbranch(branch);
		t1.getmarks(marks);
		sc.close();
	}

	void getname(String fname, String lsname) {
		String fullname = fname + "  " + lsname;
		System.out.println("my fullname is:" + fullname);

	}

	void getage(int age) {
		System.out.println("my age is:" + age);

	}

	void getweight(double weight) {
		System.out.println("my weight is:" + weight);

	}

	void getaddress(String address) {
		System.out.println("my address:" + address);
	}

	void getheight(float height) {
		System.out.println("my height:" + height);
	}

	void getrollno(int rollno) {
		System.out.println("my rollno:" + rollno);
	}

	void getclgname(String clgname) {
		System.out.println("my clgname:" + clgname);
	}

	void getbranch(String branch) {
		System.out.println("my branch:" + branch);
	}

	void getmarks(int marks) {
		System.out.println("my marks:" + marks);
	}
}
