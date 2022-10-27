package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {
	public static void main(String[] args) {
		BufferedReader reader = null;
		BufferedWriter write = null;
		try {
			// step 1
			reader = new BufferedReader(new FileReader("abc.txt"));
			write = new BufferedWriter(new FileWriter("munny.txt"));
			// step 2
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				write.write(line);
				write.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (write != null)
					write.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("resources are completed");
		}
	}

}
