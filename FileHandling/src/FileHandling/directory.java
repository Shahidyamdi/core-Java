package FileHandling;

import java.io.File;
import java.io.IOException;

public class directory {
	public static void main(String[] args) throws IOException {
		File f = new File("sameer");
		f.canExecute();
		boolean b = f.mkdir();
		if(b) {
			System.out.println("directory created");
		}
		else {
			System.out.println("already existed");
		}
		
		File f2 = new File("sameer","shahid.txt");
		f2.createNewFile();
		System.out.println(" class created in sameer directory");
		
	}

}
