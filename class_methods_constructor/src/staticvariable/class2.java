package staticvariable;

public class class2 {
	
	
	static void add(int a,int b) {
		System.out.println("static variables :" +(a+b));
	}
	public static void main(String[] args) {
		class2 c = new  class2();
		c.add(10,10);
		
		int x =100;
		int y =20;
		c.add(x, y);
	}

}
