package exceptionhandling;

public class class3 {
	public static void main(String[] args) {
		
		try {
			System.out.println("try block");
		}catch(ArithmeticException e) {
			System.out.println("catch block");
		}
		
		finally {
			System.out.println("finally");
		}
	}

}
