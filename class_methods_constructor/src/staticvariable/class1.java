package staticvariable;

public class class1 {
	int a = 10;// instance variable
	int b = 20;// instance variable

	static void add() {// static method
		class1 u = new class1();// initialize
		System.out.println("static variables add :" + (u.a + u.b));
	}

	static void multi() {// static method
		class1 v = new class1();// initialize
		System.out.println("static variables multiply :" + (v.a * v.b));
	}

	public static void main(String[] args) {
		class1 c = new class1();
		c.add();
		c.multi();
	}

}
