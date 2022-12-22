
public class imuttablevsmutable {
	public static void main(String[] args) {
		//imuttable 
		String s = "shahid";
		s.concat("md");
		System.out.println(s);
		
		
		//mutable
		StringBuffer sb = new StringBuffer("shahid");
		sb.append("md");
		System.out.println(sb);
		
		// interviewquestion
		String a = "shahid";
		a=a.concat("md");// using new variable for concat
		System.out.println(a);
		
		
		
	}

}
