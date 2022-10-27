package com.basics;

public class bitmanipulation {
//	static int countSetBitsOptimised(int n) {
//		int count = 0;
//		while(n > 0) {
//			System.out.println("total "+ n);
//			count++;
//			n = ( n &(n-1));
//		}
//		
//		return count;
//	}
	
	
	

	static int countSetBitsOptimised(int n) {
		int count = 0;
		while(n > 0) {
			System.out.println(n);
			count++;
			n = (n & (n-1));
			n >>= 1;
		}
		
		return count;
	}
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(countSetBitsOptimised(10));
		System.out.println(countSetBitsOptimised(4));
	}

}
