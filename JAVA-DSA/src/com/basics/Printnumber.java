package com.basics;

import java.util.Scanner;

public class Printnumber {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for multiply");
		number = sc.nextInt();
		System.out.println("the is  " + number);
		for (int i = 1; i <= 10; i++) {

			System.out.println(number * i);

		}

	}

}
