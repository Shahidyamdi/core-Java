package com.arrays;

public class Addition {
	public static void main(String[] args) {
		int sum = 0;
		int a[]= {10,20,30,40,50};
		
		for(int i =0;i<a.length;i++) {
			sum = sum+a[i];	
		}
		System.out.println("sum of array in addition " + sum);
	}

}
