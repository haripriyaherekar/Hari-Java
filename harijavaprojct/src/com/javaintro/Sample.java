package com.javaintro;

public class Sample {
	int id;
	String name;
	long mobilenumber;
	
	static int st_id;
	static String st_name ;
	static long st_mobilenumber;
	
	static void show(int st_id, String st_name,long st_mobilenumber ) {
		System.out.println(st_id);
		System.out.println(st_name);
		System.out.println(st_mobilenumber);
	}
	
	void display(int id, String name,long mobilenumber) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(mobilenumber);
		show(25, "hari", 12345);
		}
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.display(25,"hari",1234567);
		
	}

}
