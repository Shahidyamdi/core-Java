package enumeration;

public enum  test {
	monday,tuesday,wednesday;
	
	public static void main(String[] args) {

		test t1 = test.monday;
		test t2 = test.tuesday;
		test t3 = test.wednesday;
		test w [] = test.values();
		for(test ww :w) {
			System.out.println(ww+ " " +ww.ordinal());
		}
	}

}
