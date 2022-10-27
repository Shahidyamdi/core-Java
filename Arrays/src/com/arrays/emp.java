package com.arrays;

public class emp {
	int eid;
	String ename;
	double esal;

	public emp(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public static void main(String[] args) {
		emp e1 = new emp(111, "shahid", 20000.00);
		emp e2 = new emp(222, "sameer", 30000.00);
		emp e3 = new emp(333, "munny", 40000.00);
		emp e4 = new emp(444, "Akbar", 50000.00);

		emp e[] = new emp[4];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		e[3] = e4;

		for (emp emp : e) {
			System.out.println(emp.eid + " " + emp.ename + " " + emp.esal);

		}
	}

}
