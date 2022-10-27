package mutithreading;

public class Run extends Thread{
	public void run() {
		add(10,20);
		multi(2,2);
	}

	private void multi(int a, int b) {
		System.out.println("multiply...."+(a*b));
	}
		
	

	private void add(int a, int b) {
		System.out.println("addition...."+(a+b));
	}
	public static void main(String[] args) {
		Run r = new Run();
		r.start();
		
	}

}
