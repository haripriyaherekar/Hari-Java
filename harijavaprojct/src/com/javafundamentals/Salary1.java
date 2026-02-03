package com.javafundamentals;

public class Salary1 { 
	 static int SA=10000;
	 static double TA=0.12;
	 static double IN=0.03;
	 double ID=0.02;
	
	
	static  void display() {
		double TA1=SA*TA; 
		double IN1=SA*IN;
		double totalsalary=SA+TA1+IN1;
		
		System.out.println("TA1:"+TA1);
		System.out.println("IN1:"+IN1);
		System.out.println("totalsalary:"+totalsalary);
				
		}
	void main() {
		double totalsalary = 11500;
		double salary=SA*ID;
		double deduction = SA-salary;
		double totalsalary1 = totalsalary-salary;
		
		System.out.println("salary:"+salary);
		System.out.println("deduction:"+deduction);
		System.out.println("totalsalary1:"+totalsalary1);
	}

	public static void main(String[] args) {
		Salary1 s = new Salary1 ();
		display();
		s.main();

	}

}
