package com.basics;

import java.util.Scanner;

public class Printprimenumber {
	static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i) == true) {
				System.out.print(i + " ");

			}
		}
	}

}
