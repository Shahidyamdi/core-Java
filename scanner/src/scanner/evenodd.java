package scanner;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a Number");
	int num =sc.nextInt();
	if(num%2==0) {
		System.out.println("even number");
	}
	else if(num%2!=0) {
		System.out.println("odd number");
	}
	sc.close();

}
}
