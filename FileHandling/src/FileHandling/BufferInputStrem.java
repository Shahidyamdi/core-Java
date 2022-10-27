package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputStrem {
	public static void main(String[] args) {
		try {
BufferedInputStream inputstream = new BufferedInputStream(new FileInputStream("life.jpg.png"));
BufferedOutputStream outputstream = new BufferedOutputStream(new FileOutputStream ("shahid.jpg.png"));
int c;
while((c= inputstream.read())!=-1) {
	outputstream.write(c);

}
}catch(IOException e) {
	e.printStackTrace();
}
	
	System.out.println("operation completed");
	}
}
