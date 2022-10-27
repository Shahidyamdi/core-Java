package com.basics;

import java.util.Scanner;

public class Arrayex {
	public static void main(String[] args) {
		int[] ageList = new int[5];
		Scanner sc = new Scanner(System.in);
		
//		for(int i = 0; i<3; i++) {
//			ageList[i] = sc.nextInt();
//		}
//		
		for(int i = 0; i<5; i++) {
			System.out.println("age of roll no "+ (i+1) +" is " + ageList[i]);
		}
		
		//for each loop
		
		for(int element: ageList) {
			System.out.println(element);
	}
	}

}
