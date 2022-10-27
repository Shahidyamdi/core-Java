package mutithreading;

public class threaddemo2 {
	public static void main(String[] args) {
		mythread2 t1 = new mythread2();
		mythread2 t2 = new mythread2();
		mythread2 t3 = new mythread2();
		
		
		//get name;
		System.out.println("goodmorning "+ t1.getName());
		System.out.println("goodmorning "+ t1.getName());
		System.out.println("goodmorning "+ t1.getName());
		System.out.println("goodmorning "+t2.getName());
		System.out.println("goodmorning "+t2.getName());
		System.out.println("goodmorning "+t2.getName());
		System.out.println("goodmorning "+t3.getName());
		System.out.println("goodmorning "+t3.getName());
		System.out.println("goodmorning "+t3.getName());

	}


}
