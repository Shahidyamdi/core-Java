package com.arrays;

public class maximum {
	public static void main(String[] args) {
		int a[]= {25,60,77,80,50,40,20};
		int max =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max =a[i];
			}
		}
		System.out.println("largest number or maximum number" + max);
	}

}
