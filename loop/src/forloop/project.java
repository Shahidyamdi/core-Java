package forloop;

import java.util.Scanner;

public class project {
	public static void main(String[] args) {
		int pin = 1234;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a pin");
		int num = sc.nextInt();
		while(true) {
			if(pin!=num) {
				System.out.println("wrong pin please try again");
				break;
				
			}
			else if(pin==num) {
				System.out.println("correct pin");
				break;
			}
		}
		

	}
}
