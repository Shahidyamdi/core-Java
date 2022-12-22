package scanner;

import java.util.Scanner;

public class emp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a emp id");
			int eid = sc.nextInt();
			System.out.println("Enter a emp name");
			String ename = sc.next();
			System.out.println("Enter a salary");
			double esal = sc.nextDouble();
			
			System.out.println("one more record want (yes/no)");
			String option = sc.next();
			if(option.equals("no"))
				break;
		}
		sc.close();
	
	}
	}
		
		


