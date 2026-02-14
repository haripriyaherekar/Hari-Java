package com.Arrarys;

public class Array2 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int temp = 0;
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[0][2] = 13;

		arr[1][0] = 14;
		arr[1][1] = 15;
		arr[1][2] = 16;

		arr[2][0] = 17;
		arr[2][1] = 18;
		arr[2][2] = 19;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {

				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;

			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}
}
