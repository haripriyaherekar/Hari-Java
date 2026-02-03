package com.javaintro;

public class Data {
	byte bytevalue = 20;
	short shortvalue = 10;
	int intvalue =15;
	long longvalue =25;
	float floatvalue=11;
	double doublevalue=88;
	char charvalue=66;
	boolean booleanvalues;

	public static void main(String[] args) {
		Data d = new Data();
		
		System.out.println("bytevalue :"+ d.bytevalue);
		System.out.println(d.bytevalue);
		System.out.println("shortvalue :"+ d.shortvalue);
		System.out.println(d.shortvalue);
		System.out.println(d.intvalue);
		System.out.println(d.longvalue);
		System.out.println(d.floatvalue);
		System.out.println(d.doublevalue);
	}

}
