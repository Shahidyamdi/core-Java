
public class class1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");
		System.out.println(i1+i2);
		
		
		// 2 nd approach
		Integer i3 = Integer.valueOf(10);
		Integer i4 =  Integer.valueOf("10");
		System.out.println(i3+i4);
		
		
		// wrapper object to primitive
		Integer i5 = Integer.valueOf(10);
		Integer i6 = Integer.valueOf(10);
		int a = i5.intValue();
		double b = i6.doubleValue();
		System.out.println(a+b);
		
		//wrapper object to String
		Integer i7 = Integer.valueOf(10);
		Integer i8 = Integer.valueOf(10);
		String c =i7.toString();
		String d = i8.toString();
		System.out.println(c+d);
		
	
		
	}

}
