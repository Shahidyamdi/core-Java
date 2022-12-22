package scanner;

import java.util.Scanner;

public class biggernumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		if(num1>num2) {
			System.out.println("bigger number : " +num1);
		}
		else if(num2>num1) {
			System.out.println("bigger number : " +num2);
		}
	sc.close();
	}

}
