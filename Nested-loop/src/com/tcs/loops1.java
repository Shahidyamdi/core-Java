package com.tcs;

public class loops1 {
	public static void main(String[] args) {
		int t = 10;
		for (int i = 0; i <= t; i++) {
			for (int j = t; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
