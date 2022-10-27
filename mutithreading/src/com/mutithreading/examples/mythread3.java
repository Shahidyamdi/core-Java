package com.mutithreading.examples;

public class mythread3  extends Thread{
	public void run() {
		for(int i =0;i<3;i++) {
			System.out.println("goodevening" + Thread.currentThread().getName());
		}
	}

}
