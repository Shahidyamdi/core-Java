package exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

import javax.management.remote.JMXServerErrorException;

public class mulitpleexception {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num =sc.nextInt();
		System.out.println(num/10);
		System.out.println("shahid".charAt(55));
		}catch(ArithmeticException | StringIndexOutOfBoundsException e) {
			
		}
		

			System.out.println("shahid done");
			 
			}
			
		
	
		
	}

	

