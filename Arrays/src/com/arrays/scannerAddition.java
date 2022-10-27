package com.arrays;

import java.util.Scanner;

public class scannerAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a[]= new int[6];
		System.out.println("enter a array ");
		a[0]=sc.nextInt();
		System.out.println("enter a array ");
		a[1]=sc.nextInt();
		System.out.println("enter a array ");
		a[2]=sc.nextInt();
		System.out.println("enter a array ");
		a[3]=sc.nextInt();
		System.out.println("enter a array ");
		a[4]=sc.nextInt();
		
		for(int i =0;i<a.length;i++) {
			sum = sum+a[i];	
		}
		System.out.println("sum of array in addition " + sum);
	}

}
