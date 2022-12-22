package scanner;

import java.util.Scanner;

public class class2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number =sc.nextInt();
		if(number>0) {
			System.out.println("positive number");
		}
		else if(number <0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("zero");
		}
		sc.close();
	}
}