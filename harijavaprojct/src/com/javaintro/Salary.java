package com.javaintro;
import java.math.BigDecimal;


public class Salary {
	BigDecimal 	DArate= new BigDecimal("0.08");
	BigDecimal PFrate= new BigDecimal("0.03");
	BigDecimal CGSTrate= new BigDecimal("0.07");
	BigDecimal BS= new BigDecimal("5000.00");
	BigDecimal TM= new BigDecimal("12");
	
	
	{
		BigDecimal DA =BS.multiply(DArate);
		BigDecimal PF=BS.multiply(PFrate);
		BigDecimal CGST=BS.multiply(CGSTrate);
		BigDecimal MS=BS.add(DA).subtract(PF).subtract(CGST);   
		BigDecimal NAS= MS.multiply(TM); 
		
		System.out.println(DA);
		System.out.println(PF);
		System.out.println(CGST);
		System.out.println(MS);
		System.out.println(NAS);
		
	}
	
	public static void main(String[] args) {
		Salary s = new Salary ();
		
		
	}

}
