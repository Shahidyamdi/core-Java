package com.arrays;

public class student {
	int sid;
	String sname;
	double smarks;
	
	public student(int sid,String sname, double smarks) {
		this.sid=sid;
		this.sname=sname;
		this.smarks=smarks;
	}
	public static void main(String[] args) {
		student s[]= new student[5];
	 s[0]= new student(111, "shahid", 10.00);
	 s[1]= new student(222, "sameer", 10.00);
	 s[2] = new student(333, "munny", 10.00);
	 s[3]= new  student(444, "Akbar", 10.000);
	 for (student student : s) {
		 if(student==null) {
			 System.out.println(student);
		 }
		 else {
		 System.out.println(student.sid+ " "+student.sname+ " " + student.smarks);
		 }
	}
	}

}
