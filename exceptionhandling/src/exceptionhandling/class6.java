package exceptionhandling;

public class class6 {
	 void principal(){
		 officeboy();	
	}
	 void officeboy() {
		 hod();
	 }
	 void hod() {
		 students();
		 
	 }
	 void students()  {
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}for(int i=0;i<=10;i++) {
			System.out.println(i+"shahid calling");
		}
	 }
	public static void main(String[] args) { 
		class6 c = new class6();
		c.principal();
		
	}

}
