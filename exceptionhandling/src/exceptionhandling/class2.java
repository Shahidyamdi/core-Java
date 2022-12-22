package exceptionhandling;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class class2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("project.java");
		System.out.println(10/0);
		
		}catch(ArithmeticException |FileNotFoundException e) {
			System.out.println("shahid");
		}
	}



}
