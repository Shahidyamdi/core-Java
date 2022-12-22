package instancemethods;

public class demo1 {
	void wish() {
		System.out.println("good morning");
	}
	void add(int a ,int b) {
		int res = a+b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		demo1 d = new demo1();
		d.wish();
		d.add(10, 90);
	}

}
