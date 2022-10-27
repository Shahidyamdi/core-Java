package com.basics;

import java.util.Scanner;

public class coountdivision {
	public static void main(String[] args) {
		int number;
		int count;

		Scanner sc = new Scanner(System.in);

		while (true) {
		      System.out.print("Enter a positive integer: ");
		      number = sc.nextInt();

		      if (number < 0)
		        System.out.println("Please enter positive integer !!!");
		      else
		        break;
		    }
		
		
		count=0;

	for(

	int i = 0;i<=number;i++)
	{
		if (number % i == 0) {
			System.out.println("Total number of divisors of " + number + " is " + count);
		}

	}
}

}
