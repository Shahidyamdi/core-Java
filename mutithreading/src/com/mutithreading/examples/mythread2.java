package com.mutithreading.examples;

public class mythread2 extends Thread {
	public void run() {
		for(int i =0;i<3;i++) {
			System.out.println("goodAfternoon" + Thread.currentThread().getName());
		}
	}

}
