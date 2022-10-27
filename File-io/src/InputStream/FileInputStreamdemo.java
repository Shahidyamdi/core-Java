package InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamdemo {
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream( new File ("/demo/myfile.txt"));
		System.out.println("open file");
		int i;
		while((i= fis.read())!=-1) {
			System.out.print((char)i);
			
		}
		fis.close();
		System.out.println("close");
		
	}

}
