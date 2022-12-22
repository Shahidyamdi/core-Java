
public class class5StringMethods {
	public static void main(String[] args) {
		String s= "shahid";
		System.out.println(s.charAt(5));
		//System.out.println(s.trim());
		System.out.println(s.indent(4));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('d'));
		System.out.println(s.length());
		String [] h =  s.split(" ");
		for(String i:h) {
			System.out.println(i);
		}
		
		
//		String s1 = "sameer";
//		System.out.println(s1.startsWith("s"));
//		System.out.println(s1.endsWith("r"));
//		System.out.println(s1.contains("a"));
//		System.out.println(s1.substring(1));
//		System.out.println(s1.trim().substring(1, 3));
//		
//		
//		int a []= {10,20,30,40};
//		System.out.println(a.length);
//		String d = "akbar";
//		System.out.println(d.length());
//		
//		
//		String m = " hi munny how are you";
//		 String l []  = m.split(" ");
//		 for(String k :l){
//		 System.out.println(k);
//		 }
		
	}

}
