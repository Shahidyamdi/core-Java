package mutithreading;

public class solclass1 {
	public static void main(String[] args) throws InterruptedException {
		class1 c1 = new class1();
		class1 c2 = new class1();
		class1 c3 = new class1();
		c1.start();
		c1.join();
		c2.start();
		c2.join();
		c3.start();
		
	}

}
