package exceptionhandling;

public class class1 {
	void m1() {
		m2();
	}
	void m2() {
		m3();
	}
	void m3() {
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		class1 c =new class1();
		c.m3();
	}

}
