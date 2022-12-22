package userexception;
import java.util.Scanner;

public class classage2 {
	static void status(int age)  {
		
		if(age>20) {
			System.out.println("most eligible bachelor");
		}
		else {
			throw new invalidageexception2("you are not eligible");
		}
		
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a age");
		int age = sc.nextInt();
		classage2.status(age);
		
	}

}
