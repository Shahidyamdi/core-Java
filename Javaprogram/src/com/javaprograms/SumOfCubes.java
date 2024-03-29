package com.javaprograms;

import java.util.Scanner;

public class SumOfCubes {
	public static double cube(Double num) {
		if (num == 0) {
			return 0;
		} else {
			return Math.pow(num, 3) + cube(num - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		double num = sc.nextInt();
		System.out.print("Sum of digit cube is: " + cube(num));
		sc.close();

	}
}
