

public class emp{
	emp m1() {
		System.out.println("emp m1 method");
		emp e = new emp();
		return e;
	}
	class  student extends emp{
		student m2() {
			System.out.println("student m2 method");
			student s = new student();
			return s;
		}
	}
	public static void main(String[] args) {
	
		
		
	}
}
