package com.basics;

import java.util.Scanner;

public class ElapsedTime {
	public static void main(String[] args) {
		long startTime; // start time
		long endTime; // end time
		double time;

		startTime = System.currentTimeMillis();
		System.out.println("enter a name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println("thanks " + name + "!");

		endTime = System.currentTimeMillis();
		time = (endTime - startTime);
		System.out.println("\nElapsed Time is:  " + time);
	}

}
