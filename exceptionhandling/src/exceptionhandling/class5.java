package exceptionhandling;

import java.util.Scanner;

public class class5 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num = sc.nextInt();
	try {
	System.out.println(10/num);
	
	try {
		System.out.println("shahid".charAt(15));
		
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println(" String catch block");
	}
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic block exception");
	}
	finally {
		System.out.println("finally block");
	}
	}
}
