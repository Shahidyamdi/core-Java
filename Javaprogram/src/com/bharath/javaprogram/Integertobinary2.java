package com.bharath.javaprogram;

import java.util.Scanner;

public class Integertobinary2 {
	public static void main(String[] args) {
		System.out.println("Enter a number:");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		System.out.println(Integer.toBinaryString(num));

	}

}
