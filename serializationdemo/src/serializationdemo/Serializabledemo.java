package serializationdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serializabledemo {
	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream("/demo/emp.ser");
			oos = new ObjectOutputStream(fos);
			Empolyee emp = new Empolyee(1, "shahid", 1000000, 10);
			oos.writeObject(emp);
			System.out.println("serializable done");
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		}
	}

}
