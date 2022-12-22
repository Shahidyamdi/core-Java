package miniproject;

public class student {
	int sid;
	String sname;
	String schoolname;
	parents p;
	marks m;
	Address addr;

	public student(int sid, String sname, String schoolname, parents p, marks m, Address addr) {

		this.sid = sid;
		this.sname = sname;
		this.schoolname = schoolname;
		this.p = p;
		this.m = m;
		this.addr = addr;

	}

	void display() {
		System.out.println("studentid       :" + sid);
		System.out.println("studentname     :" + sname);
		System.out.println("student school  :" + schoolname);
		System.out.println("studentparents  :" + p.fathername + " " + p.mothername);
		System.out.println("studentmarks    :" + m.m1 + " " + m.m2 + " " + m.m3);
		System.out.println("studentAddress  :" + addr.dno + " " + addr.pincode + " " + addr.state + " " + addr.country);

	}

	void status() {
		if (m.m1 + m.m2 + m.m3 >= 150) {
			System.out.println("you are pass");

		} else {
			System.out.println("you are fail");
		}
	}

	public static void main(String[] args) {
		Address a1 = new Address(20, 521001, "Ap", "india");
		marks m1 = new marks(100, 100, 100);
		parents p1 = new parents("Akbar", "munny");

		student s1 = new student(1, "shahid", "nirmala", p1, m1, a1);
		s1.display();
		s1.status();

		System.out.println("====================================================");
		student s2 = new student(2, "sameer", "nirmala", new parents("Akbar", "munny"), new marks(50, 50, 50),
				new Address(20, 521001, "Ap", "india"));
		s2.display();
		s2.status();

		System.out.println("=======================================================");

	}

}
