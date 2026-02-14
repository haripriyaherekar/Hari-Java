package com.Arrarys;

public class TestDemo3 {

	public static void main(String[] args) {
		int[] num = { 1, 0, 2, 3, 0, 5, 0 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] == 0) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}

		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
}