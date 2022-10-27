package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class filereaderdemo {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("def.txt");
		FileWriter writer = new FileWriter("ghi.txt");
		
		int c;
		while((c = reader.read())!= -1) {
			System.out.println((char) c);
			writer.write(c);
		}
		reader.close();
		writer.close();
	}
	

}
