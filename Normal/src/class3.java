
public class class3 {
	 private void sameer() {
		System.out.println("thinking  marry");
	}
	class parent extends class3{
		void sameer() {
			System.out.println("tq beta");
		}
	}
	public static void main(String[] args) {
		class3 c = new class3().new parent();
		c.sameer();
		
	}

}
 