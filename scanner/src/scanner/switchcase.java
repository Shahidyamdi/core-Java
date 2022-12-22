package scanner;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		System.out.println("Enter a week");
		Scanner sc = new Scanner(System.in);
		String week=sc.next();
		switch(week) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "Thursday":
		case "friday":
			System.out.println("working.....");
			break;
		case "saturday":
		case "sunday":
			System.out.println("weekendays.............");
			break;
			default:
				System.out.println("Error please correct");
		
		}
		sc.close();
	}

}
