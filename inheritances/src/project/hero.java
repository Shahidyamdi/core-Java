package project;

public class hero {
	String name;
	int age;
	double height;
	Address addr;
	movie m;
	
	public hero( String name,int age,double height, Address addr,movie m) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.addr=addr;
		this.m=m;
		
	}
	void display() {
		System.out.println("hero name :" +name);
		System.out.println("hero age  :" +age);
		System.out.println("hero height :" +height);
		System.out.println("hero Address :" +addr.dno+" "+addr.street+" "+addr.city);
		System.out.println("hero movie :" +m.bollywoodmovies+" "+m.tollywoodmovies);
	}
	public static void main(String[] args) {
		// name object
		Address a = new Address(112,"jubile hills","ts");
		movie n = new movie("svp", "avlp");
		hero h1 = new hero("maheshbabu",50,6.1,a,n);
		h1.display();
		System.out.println("===========================");
		
		// name less object
		hero h2 = new hero("shahid", 27, 5.11, new Address(20, "Rtc colony", "AP"),new movie("java", "bava"));
		h2.display();
		
	}
}
