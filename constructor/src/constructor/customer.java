package constructor;

public class customer {
	String cname;
	int pid;
	String pname;
	double pcost;
	int quantity;
	static int gst = 10;
	static String brand = "honeywell";
	static int discount = 5 ;

	public customer(String cname, int pid, double pcost, int quantity) {
		this.cname = cname;
		this.pid = pid;
		this.pcost = pcost;
		this.quantity = quantity;

	}
	double bill;
	double total_bill() {
		bill= pcost -(pcost * discount/100);
		System.out.println(cname+ " "+pid+" "+pcost+" "+quantity+" "+customer.gst+ " "+customer.brand+" "+customer.discount);
		return bill;
		
	}

	public static void main(String[] args) {
		customer c = new customer("shahid", 123, 1000, 1);
		double amount =c.total_bill();
		System.out.println(amount);
	}

}
