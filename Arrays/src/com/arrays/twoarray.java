package com.arrays;

public class twoarray {
	public static void main(String[] args) {
		int a[][]= {
				{1,2,3,4},
				{2,4,6},
				{1,2,3,},
				{1,2}
				
		};
		
		for(int k[]: a) {
			for(int l:k) {
				System.out.print( " " +l);
				
			}
			System.out.println();
		}
	}

}
