package ReaderAndWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderandWriterdemo {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("/demo/myfile.txt");
		FileWriter fw = new FileWriter("/demo/mynewfile.txt");
		
		
		int i;
		while((i=fr.read())!=-1) {
			fw.write(i);
		}
		fr.close();
		fw.close();
		
	}

}
