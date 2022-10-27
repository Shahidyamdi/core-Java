package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferReaderdemo {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		int count =0;
		
		try {
			fr = new FileReader("/demo/myfile.txt");
			br = new BufferedReader(fr);
			String line;
			
			while((line=br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(line);	
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			
			}
			System.out.println("number of count is : "+count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
