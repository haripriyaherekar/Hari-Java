package com.Arrarys;

public class Target {

	public static void main(String[] args) {
		int[] arr = { 325, 252, 125, 627, 823 };
		int target = 2;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			while (n > 0) {
				int r = n % 10;
				n = n / 10;
				if (r == target) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
