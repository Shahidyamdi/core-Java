
public class class7 {
	public static void main(String[] args) {
		int i,j;
		for(i=1,j=1;i<5;i++) {
			if(i>2&&++j==2)
				break;
			else i+=10;
		}
		System.out.println(i+" "+j);
	}

}
