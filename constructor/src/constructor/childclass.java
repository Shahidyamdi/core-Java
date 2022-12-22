package constructor;

public class childclass extends parentsclass {
	public childclass() {
		System.out.println(" default  no args in child class constructor");
		
	}
	public childclass(int a) {
		super(a);
		System.out.println(" parameterized one args in child class constructor");
		
	}

}
