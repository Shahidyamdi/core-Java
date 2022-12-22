package forloop;

public class evenloop {
	public static void main(String[] args) {
		int i, number = 10, sum = 0;
		for (i = 1; i < 10; i = i + i) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("odd number adding all :" + sum);
	}

}
