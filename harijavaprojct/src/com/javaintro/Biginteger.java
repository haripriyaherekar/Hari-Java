package com.javaintro;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;

class monkey {
	
}



public class Biginteger {
	BigInteger b= new BigInteger("245678366446763");
	BigInteger b1 = new BigInteger("5678909876543");
	BigInteger b2 = new BigInteger("7653349876543");
	
	BigDecimal bd1= new BigDecimal("75745.00");
	BigDecimal bd2= new BigDecimal("75742.00");

	public static void main(String[] args) {
		Biginteger t1 =new Biginteger();
		
		
		System.out.println(t1.b.add(t1.b1));
		System.out.println(t1.b1.add(t1.b2));
		System.out.println(t1.b.divide(t1.b1));
		System.out.println(t1.b1.divide(t1.b2));
		System.out.println(t1.b.multiply(t1.b1));
		System.out.println(t1.b1.multiply(t1.b2));
		System.out.println(t1.b.subtract(t1.b1));
		System.out.println(t1.b1.subtract(t1.b2));
		
		System.out.println("***********"); 
		System.out.println(t1.bd1.add(t1.bd2));
		System.out.println(t1.bd1.subtract(t1.bd2));
		System.out.println(t1.bd1.multiply(t1.bd2));
		System.out.println(t1.bd1.divide(t1.bd2,18, RoundingMode.HALF_UP));
	
	}

}
