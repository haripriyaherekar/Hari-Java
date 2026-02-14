package com.Arrarys;

public class Test1 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		int even = 0;
		int odd = 0;

		for (int i = 0; i < num.length; i++) {
			if(i%2 ==0) {
			num[i]=num[i]*num[i];
			
			}else {
				num[i]=num[i]*2;
				
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}

}
