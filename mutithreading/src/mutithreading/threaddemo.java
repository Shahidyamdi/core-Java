package mutithreading;

public class threaddemo {
	public static void main(String[] args) {
		mythread t = new mythread();
		t.start();
		
		
		for(int i =0;i<10;i++) {
			System.out.println("main thread");
		}
	}

}
