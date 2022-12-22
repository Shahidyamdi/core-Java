package methods_return;

public class product {
	double bill;

	double totalBill(String productName, double cost, int quantity) {

		bill = cost * quantity;
		return bill;
	}

	static int productOrder(String name, String location, int cost) {
		if (cost > 200) {
			return 1323;
		} else {
			return 456;
		}
	}

	public static void main(String[] args) {
		product p = new product();
		double bills = p.totalBill("pen", 20, 5);
		System.out.println(bills);
		
		
	int num = p.productOrder("mango", "nuzividu", 100);
	System.out.println(num);
	}

}
