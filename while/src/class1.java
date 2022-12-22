import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("empid");
			int empid = sc.nextInt();
			System.out.println("empname");
			String empname = sc.next();
			System.out.println("empsalary");
			int empsalary = sc.nextInt();
			System.out.println(" information:" + empid + " " + empname + " " + empsalary);
			System.out.println("do you want more record()yes/no");
			String yes = sc.next();
			String no = sc.next();

			if (yes==null) {
				continue;

			} else if (no == null) {
				break;
			}

		}

	}

}
