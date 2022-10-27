package FileHandling;

import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class characterorientedchannel {
	public static void main(String[] args) throws IOException {
		// step1 : create the channel
		FileReader reader = new FileReader("abc.txt");
		FileWriter writer = new FileWriter("cba.txt");

		// step 2 read and write operations
		int c;
		while ((c = reader.read()) != -1) {
			System.out.println((char) c);
			writer.write(c);

		}
		// step 3 : close the resources
		reader.close();
		writer.close();

		System.out.println(" resource completed");

	}

}
