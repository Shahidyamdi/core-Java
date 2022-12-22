
public class class1 {
	public static void main(String[] args) {
		//String to StringBuffer
		String s= "shahid";
		System.out.println(s);
		
		StringBuffer sb =  new StringBuffer(s);
		System.out.println(sb.reverse());
		
		// StringBuffer to String
		StringBuffer sc = new StringBuffer("shahid");
		System.out.println(sc.toString());
		String g =sc.toString();
		System.out.println(g);
	}

}
