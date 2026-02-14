package com.Arrarys;

public class Array1 {

	public static void main(String[] args) {
		int [][] arr = new  int[3][3];
		arr[0][0]=11;
		arr[0][1]=12;
		arr[0][2]=13;
		
		arr[1][0]=14;
		arr[1][1]=15;
		arr[1][2]=16;
		
		arr[2][0]=17;
		arr[2][1]=18;
		arr[2][2]=19;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("***********");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i] + " | ");
			}
			System.out.println();
		}
	}

}
