package com.basics;

public class Nestedloopsdemo {
	
	public void print (int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.println("i=" +i +  ",J=" +j);
			}
			System.out.println("inner loop");
			
		}
		System.out.println("outer loop");
	}
	public static void main(String[] args) {
		Nestedloopsdemo n = new Nestedloopsdemo();
		n.print(5);
	}

}
