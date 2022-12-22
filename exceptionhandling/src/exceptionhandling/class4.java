package exceptionhandling;

public class class4 extends Exception {
		int m1 () {
		try {
			//System.out.println(10);
			System.out.println("shahid".charAt(3));
			int a[]= {10,20,30,};
			System.out.println(a[1]);
			return 10;
			
		}catch(Exception e) {
			return 20;
		}
		finally {
			System.out.println("final");
		}
		
	}
		public static void main(String[] args) {
			class4 c = new class4();
			int y =c.m1();
			System.out.println(y);
			
		}

}
 