package com.javafundamentals;

public class S1 {
	int rollno;
	String name;
	String branch;
	

	public S1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public S1(S1 s,S1 s1,String branch) {
		this.rollno = s.rollno;
		this.name = s.name;
		this.branch=branch;
	}
	public static void main(String[] args) {
		S1 s =new S1(10,"hari");
		s.display();
	
		S1 s1=new S1(s,s,"ece");
		s1.display();
	}
	void display() {
		System.out.println("rollno:" + rollno);
		System.out.println("name:" + name);
		System.out.println("branch:" + branch);
	}
}
