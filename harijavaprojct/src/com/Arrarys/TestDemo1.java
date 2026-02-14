package com.Arrarys;

public class TestDemo1 {

	public static void main(String[] args) {
		//declaration
		int [] num;
		//creation
		num=new int[5];
		//intilazation
		num[0]=10;
		num[1]=12;
		num[2]=195;
		num[3]=170;
		num[4]=25;
		
		
		//for each loop
		for(int n:num) {
			System.out.println(n+" ");
		}
//		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//			
//		}
//		
		//repersentation
		//System.out.println(num[0]);
		//System.out.println(num[1]);
		//System.out.println(num[2]);
		//System.out.println(num[3]);
		//System.out.println(num[4]);
	}

}
