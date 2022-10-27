package outputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStramDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("demo/shahid.jpg");
			FileOutputStream fos = new FileOutputStream("demo/myimage.jpg");
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
