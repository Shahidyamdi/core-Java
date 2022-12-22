package Instancevariables;

public class class1 {
	int a =10;
	int b =20;
	
	void add() {
		System.out.println(a+b);
	}
	void multi() {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		class1 c = new class1();
		c.add();
		c.multi();
	}

}
