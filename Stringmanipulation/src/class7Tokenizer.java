import java.util.StringTokenizer;

public class class7Tokenizer {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("hi. sir. how. are you"," .");
		while(st.hasMoreElements()) {
			String s = (String)st.nextElement();
			System.out.println(s);
		}
	}

}
