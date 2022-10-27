package FileHandling;

import java.util.StringTokenizer;

public class Stringtokienzerdemo {
	public static void main(String[] args) {
		String s = "hi shahid !  how are you";
		
		StringTokenizer st =new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
