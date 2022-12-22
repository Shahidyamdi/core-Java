package tostring;

public class example1 {
	int eid;
	String ename;
	public example1(int eid,String ename) {
		this.eid = eid;
		this.ename=ename;
	}
	
	public String toString() {
		return "EMP Id: "+eid+" Emp NAME : "+ename;
	}
	public static void main(String[] args) {
		example1 e = new example1(123,"shahid");
		example1 e1 = new example1(124,"sameer");
		example1 e2 = new example1(125,"Akbar");
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
