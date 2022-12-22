package inheritances;

public class class1constructor {

}

class parents {
	public parents() {
		System.out.println("0 args constructor parents");
	}
	public parents(int a) {
		System.out.println("1 args constructor parents");
	}
}

class child extends parents {
	public child() {
		super();
		System.out.println("0 args constructor child");

	}

	public child(int a) {
		super(10);
		System.out.println("1 args constructor in child");

	}

}
