package forloop;

public class oddloop {
	public static void main(String[] args) {
		int i, number = 10, sum = 0;
		for (i = 1; i < 10; i = i +2) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("even number adding all :" + sum);
	}

}


