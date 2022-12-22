package project;

public interface party {
	void eat();
	default void common_eat() {
		System.out.println(" drinks,icecream,salad");
	}

}
