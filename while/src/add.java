
public class add {
	int sum = 0;

	public int add(int... n) {
		for (int i : n) {
			sum = sum + i;
		}
		return sum;

	}

	public static void main(String[] args) {
		add d = new add();
		;
		System.out.println("total " + d.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

	}

}
