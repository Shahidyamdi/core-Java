package com.Runnable;

public class Runnableex  implements Runnable{

	@Override
	public void run() {
		System.out.println("goodmorning"+Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		Runnableex r1 = new Runnableex();
		new Thread(r1).start();
		new Thread(new Runnableex()).start();
		// lambda
		new Thread(() -> System.out.println("lambda expression")).start();;
	}

}
