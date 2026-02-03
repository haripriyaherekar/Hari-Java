package com.javafundamentals;

public class Student {
	int rollno;
	String name;
	String branch;

	Student(int rollno) {
		this.rollno = rollno;

	}
	Student(Student s,String name){
		this.rollno=s.rollno;
		this.name=name;
	
	}
	Student(Student s,Student s1,String branch){
		this.rollno=s.rollno;
		this.name=s1.name;
		this.branch=branch;
	
	}

	
		public static void main(String[] args) {
		Student s = new Student(10);
		s.display();
		Student s1 = new Student(s,"hari");
		s1.display();
		Student s2 = new Student(s,s1,"ECE");
		s2.display();

	}

	void display() {
		System.out.println("rollno:" + rollno);
		System.out.println("name:" + name);
		System.out.println("branch:" + branch);
	}
}
