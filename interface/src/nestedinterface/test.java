package nestedinterface;

public class test implements class1,class1.class2{

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void m1() {
		System.out.println("m3");
		
	}
	public static void main(String[] args) {
		test t = new test();
		t.m1();
		t.m2();
	}

}
