package serializationdemo;

import java.io.Serializable;

public class Empolyee implements Serializable {
	int id;
	String name;
	double salary;
	transient int ssn;
	
	Empolyee(int id,String name,double salary,int ssn){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.ssn=ssn;
	}

}
