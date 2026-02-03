package com.javaintro;

public class Student2 {
	int std_rollno;
	String std_name;
	int std_marks;
	boolean std_ispassed;
	
	void display(int std_rollno,String std_name,int std_marks,boolean std_ispassed) {
		System.out.println(std_rollno);
		System.out.println(std_name);
		System.out.println(std_marks);
		System.out.println(std_ispassed);
		
		
	}
		
		
		public static void main(String[] args) {
			
			
			Student2 s1 = new Student2();
			Student2 s2= new Student2();
			Student2 s3 = new Student2();
			
			

			s1.display( 12,"xyz",789, true);
			s2.display(33,"hari",897,true);
			s3.display(35,"you",899,false);
	}

}
