package instancemethods;

public class test {
	demo d ;
	void m1() {
		d = new demo();
		d.info();
		
	}
	void m2() {
		d.info();
		
	}
	void m3() {
		d.info();
		
	}
	public static void main(String[] args) {
		test t = new test();
		t.m1();
		t.m2();
		t.m3();
	}

}
