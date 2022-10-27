package FileHandling;

import java.io.File;
import java.io.IOException;

public class file {
	public static void main(String[] args) throws IOException {
		File file = new File("shahid.txt");
		System.out.println(file.exists());
		
		boolean status = file.createNewFile();
			if(status) {
				System.out.println("file created" +file.getPath());
			}
			else {
				System.out.println("already existed");
			}
			System.out.println(file.exists());
		}
	}


