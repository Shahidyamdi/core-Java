package com.mutithreading.examples;

public class Threaddemo {
	public static void main(String[] args) throws InterruptedException {

		mythread1 t1 = new mythread1();
        t1.setName("shahid");
		mythread2 t2 = new mythread2();
		t2.setName("sameer");
		mythread3 t3 = new mythread3();
		t3.setName("chotu");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();

	}
}
