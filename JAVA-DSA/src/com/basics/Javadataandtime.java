package com.basics;

import java.time.LocalDate;
import java.util.Scanner;

public class Javadataandtime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a month");
		int month = in.nextInt();
		System.out.println("Enter a day");
		int day = in.nextInt();
		System.out.println("Enter a year");
		int year = in.nextInt();
		LocalDate dt = LocalDate.of(year, month, day);
		System.out.println(dt.getDayOfWeek());
		in.close();
	}
	
}
