package exceptionhandling;
import java.util.Scanner;

public class project {
	public static  void main(String args[]) {
		try {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(10/a);
	
		
		int c[]  = {10,20,30,40};
		System.out.println("shahid".charAt(8));

		System.out.println(c[5] );
	}   catch(Exception e) {  
		
		
	
		
		}finally{
			System.out.println("okay fine");
			
		}
	}
}
		
		
	

