package serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializationdemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("/demo/emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		Empolyee emp=(Empolyee)obj;
		
		System.out.println("empolyee id : " +emp.id);
		System.out.println("empolyee name : " +emp.name);
		System.out.println("empolyee salary: " +emp.salary);
		System.out.println("empolyee ssn : " +emp.ssn);

	}

}
