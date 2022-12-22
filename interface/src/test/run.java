package test;

public class run implements test1,test2 {

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

	@Override
	public void m1() {
		System.out.println("m1");
		
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}
	public static void main(String[] args) {
		run r = new run();
		r.m1();r.m2();r.m3();
	}

}
