package interfaceproject2;

public class ratan implements message{

	@Override
	public void wish() {
		System.out.println("hi students goodmorning");
		
	}
	public void hi() {
		System.out.println(" how are you all");
	}
	public static void main(String[] args) {
		message r = new ratan();
		r.wish();
		ratan s =(ratan)r;//down casting
		s.hi();
	}

}
