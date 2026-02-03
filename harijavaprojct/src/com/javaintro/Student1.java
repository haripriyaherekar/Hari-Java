package com.javaintro;

public class Student1 {
	int id =1;
	String name = "hari";
	long mobilenumber =12345;
	
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(mobilenumber);
		
	}
		static void show() {
			Student1 s = new Student1();
			s.display();
		}
		
		public static void main(String[] args) {
		show();
		
		
		}
	}
		


