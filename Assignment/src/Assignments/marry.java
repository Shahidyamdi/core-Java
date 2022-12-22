package Assignments;

public class marry {
	static void marry(String name, int age, double bankbalance) {
		if (age < 18) {
			System.out.println(" Not eligiable");
		} else if (age >= 35) {
			System.out.println("sorry to late");
		} else if (age > 18 && age <= 34) {
			System.out.println("ready for marriage......enjoy");

		} else {
			System.out.println("leave it");
		}

	}

	public static void main(String[] args) {
		marry m = new marry();
		m.marry("sameer", 60, 100000.00);
	}

}
