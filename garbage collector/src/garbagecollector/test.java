package garbagecollector;

public class test {
	public void finalized() {
		System.out.println("garbage destroyed");
		
	}
	
	public static void main(String[] args)  {
		test t1 = new test();
		test t2 = new test();
		System.out.println(t1);
		System.out.println(t2);
		t1 = null;
		t2 =null;
		System.out.println(t1);
		System.out.println(t2);
		System.gc();
		
		
	}

}
