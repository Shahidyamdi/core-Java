package scanner;

import java.util.Scanner;

public class project {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.next();
		System.out.println("Enter a maths marks");
		int maths = sc.nextInt();
		System.out.println("Enter a science marks");
		int science = sc.nextInt();
		System.out.println("Enter a social marks");
		int social = sc.nextInt();
		int total = maths + science + social;
		int percentage = total / 3;
		System.out.println("student grade is :");

		if (percentage > 70) {
			System.out.println('A');
		} else if (percentage > 69) {
			System.out.println('B');
		} else if (percentage > 50) {
			System.out.println('c');
		} else if (percentage > 49) {
			System.out.println('D');
		} else {
			System.out.println("sorry  you are fail");
		}
		System.out.println(
				"students name :" + name + " total marks:" + total + " you are percentage :" + percentage + " ");

		sc.close();
	}

}
