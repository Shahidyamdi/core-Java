package interfaceproject;

public class test {
	void info(birds b) {
		b.fly();
		b.swim();

	}

	public static void main(String[] args) {
		test t = new test();
		t.info(new parrot());
		t.info(new penguin());
	}

}
