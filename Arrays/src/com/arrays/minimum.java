package com.arrays;

public class minimum {
	public static void main(String[] args) {

		int a[] = { 25, 60, 77, 80, 50, 40, 20 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("largest number or maximum number" + min);
	}

}
