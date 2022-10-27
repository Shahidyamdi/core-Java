package com.mutithreading.tables;

public class table  extends Thread{
	int n;
	public table(int n) {
		this.n=n;
		
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		table t1 = new table(3);
		t1.start();
		t1.join();
		table t2 = new table(7);
		t2.start();
		t2.join();
	}

}
