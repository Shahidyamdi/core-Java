package Instancevariables;

public class test {
	void add() {
		demo d = new demo();
		System.out.println(d.a+d.b);
	}
	void multi() {
		demo d = new demo();
		System.out.println(d.a*d.b);
		
	}
	public static void main(String[] args) {
		test t = new test();
		t.add();
		t.multi();
		
	}

}
