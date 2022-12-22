package scanner;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		int num = sc.nextInt();
		if (num % 4 == 0) {
			System.out.println("leap year" + num);
		} else if (num % 4 != 0) {
			System.out.println("Not a leap year : " + num);
		}
		sc.close();

	}

}
