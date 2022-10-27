package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteorientedchannel {
	public static void main(String[] args) throws IOException {
		// Resources declaration
		FileInputStream inputstream = null;
		FileOutputStream outputstream = null;

		try {
			inputstream = new FileInputStream("life.jpg.png");
			outputstream = new FileOutputStream("futher.jpg.png");
			System.out.println("done sucessfully");
			int c;
			while ((c = inputstream.read()) != -1) {
				System.out.println(c);
				outputstream.write(c);
			}
		}

		finally {
			if (inputstream != null)
				inputstream.close();
			if (outputstream != null)
				outputstream.close();

		}
	}

}
