package exceptionhandling;
import java.io.*;

public class class7 {
	void m1() {
		try {
			try {
				m2();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	void m2() throws InterruptedException,FileNotFoundException {
		
		while(true) {
			Thread.sleep(5000);
		System.out.println("hi shahid..you get job in microsoft");
		}
		//FileInputStream fis = new FileInputStream("abc");
	}
	public static void main(String[] args) {
		class7 c = new class7();
		c.m1();
	}

}
