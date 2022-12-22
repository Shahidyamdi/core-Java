package polymorphismmethodoverloading;

public class class1 {
	void sum(int a) {
		System.out.println(a);
		
	}
	void sum(double a ,double b) {
		System.out.println(a+b);
		
	}
	void sum(int a ,int b) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		class1 c = new class1();
		c.sum(10);
		c.sum(20.00, 20.00);
		c.sum(20, 80);
	}
	

}
