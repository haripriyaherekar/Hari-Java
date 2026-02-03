package com.javaintro;

public class student {
static {
	System.out.println("static block 1 executed");
}
static {
	System.out.println("static block 2 executed");
	
}
{
	System.out.println("instance block executed");
	
}
	public static void main(String[] args) {
		student s = new student();
		
	}

}
