package constructor;

public class parentsclass {
	int a;
	public parentsclass() {
		System.out.println("default no args parentsclass  constructor");
	}
	public parentsclass(int a) {
		this.a=a;
		System.out.println("parameterized one args parentsclass constructor");
	}

}
