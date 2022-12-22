package userexceptionhandling;

import java.util.Scanner;

public class test {
	static  void check(int age) {
	
	if(age<18) {
		throw new tooyoung();
	}
	else if (age>35){
		throw new tooold ("not eligible");
	}
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a age for marriage");
		int age = sc.nextInt();
		new test().check(age);
		sc.close();
		
}
	
}
