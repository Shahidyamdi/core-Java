package userexception;

import java.util.Scanner;

public class classage {
	static void status(int age) throws invalidageexception  {
		
		if(age>20) {
			System.out.println("most eligible bachelor");
		}
		else {
			throw new invalidageexception();
		}
		
	}
	public static void main(String[] args) throws invalidageexception {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a age");
		int age = sc.nextInt();
		 classage.status(age);
		
	}

}
