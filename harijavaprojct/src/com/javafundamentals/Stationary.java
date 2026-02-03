package com.javafundamentals;


public class Stationary {
	int RW =18000;
	int LC =12000;//local cost
	int OV =6000;//factory overload
	
	double WM =0.05;
	double SW =0.02;
	
	int PS=3000;
	int MC=4000;
	
	int TP = 2000;//total product
	public static void main(String[] args) {
		Stationary s =new Stationary();
		
//		System.out.println(s.RW*s.WM);
//		System.out.println(s.RW*s.SW);
		double RawMaterial=s.RW*s.WM;  
		double Wastage=s.RW*s.SW;
		double actualcost = s.RW-RawMaterial;
		double scrap = actualcost+Wastage;
		double additional = s.PS+s.LC+s.OV+scrap;
		double totalproducts= additional/s.TP;
		
		System.out.println(RawMaterial);
		System.out.println(Wastage);
		System.out.println(actualcost);
		System.out.println(scrap);
		System.out.println(additional);
		System.out.println(totalproducts);
		
	}

}
