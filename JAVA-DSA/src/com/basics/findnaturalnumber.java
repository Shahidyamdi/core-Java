package com.basics;

public class findnaturalnumber {
	
//	public int findsum(int n) {
//		return n*(n+1)/2;
//		
//	}
	public int findsum(int n) {
	int sum=0;
	for(int i =1;i<=n;i++) {
		sum = sum +i;
	}
	return sum;
	}
	public static void main(String[] args) {
		double  now = System.currentTimeMillis();
		findnaturalnumber v = new findnaturalnumber();
		System.out.println(v.findsum(99999));
		System.out.println("time  taken -"+(System.currentTimeMillis()-now)+ "millisecs");
	}

}
