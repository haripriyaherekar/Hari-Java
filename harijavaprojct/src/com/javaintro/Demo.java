package com.javaintro;

public class Demo {
	int id=10;
	static int st_no=22;
			
	static {
		System.out.println(st_no);
	}
	static void display() {
		System.out.println(st_no);
	}
	void show () {
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		{
			Demo d =new Demo ();
			System.out.println(d.id);
			display();
			d.show();
		}
	
		
	}

}
