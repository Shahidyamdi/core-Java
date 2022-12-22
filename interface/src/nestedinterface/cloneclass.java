package nestedinterface;

public class cloneclass implements Cloneable {
	int a = 10;
	int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		cloneclass c = new cloneclass();
		System.out.println("normal class" + (c.a + c.b));
	cloneclass a =	(cloneclass)c;
	System.out.println("cloneable class" +(a.a+a.b));
		c.clone();

	}

}
