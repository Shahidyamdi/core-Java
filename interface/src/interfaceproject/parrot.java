package interfaceproject;

public class parrot implements birds {

	@Override
	public void fly() {
		System.out.println("birds can fly");
		
	}

	@Override
	public void swim() {
		System.out.println("bird can't swim");
		
	}

}
