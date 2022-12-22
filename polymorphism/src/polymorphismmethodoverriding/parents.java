package polymorphismmethodoverriding;

public class parents {
	void m1() {
		System.out.println("iam  parents m1 method");
	}

	public class child extends parents {
		void m1() {
			System.out.println("iam child m1 method");
		}

	}
}
