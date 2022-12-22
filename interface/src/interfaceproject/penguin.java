package interfaceproject;

public class penguin implements birds{

	@Override
	public void fly() {
		System.out.println("penguin can't fly");
		
	}

	@Override
	public void swim() {
		System.out.println("penguin can swim");
		
	}

}
