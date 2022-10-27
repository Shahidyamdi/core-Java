package com.mutithreading.examples;

public class mythread1 extends Thread {
	public void run() {
		for(int i =0;i<2;i++) {
			System.out.println("goodmorning" + Thread.currentThread().getName());
		}
	}

}
