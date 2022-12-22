
public class class8 {
	public static void main(String[] args) {
		int a=10,b=20;
		int res =(++a + b--)==21 && (a++ + --b)==20?++a+--b:a--+b--;
		System.out.println(res);
	}
	

}
