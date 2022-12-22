
public class class3equalmethods {
	public static void main(String[] args) {
		String s1 = "shahid";
		String s2 = "sameer";
		String s3 = "shahid";
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println("shahid".equalsIgnoreCase("SHAHID"));
//		

		StringBuffer sb1 = new StringBuffer("shahid");
		StringBuffer sb2 = new StringBuffer("md");
		StringBuffer sb3 = new StringBuffer("shahid");
		System.out.println(sb1.equals(sb3));
		System.out.println(sb2.equals(sb3));
		System.out.println(sb1.equals(sb2));
		
	}

}
