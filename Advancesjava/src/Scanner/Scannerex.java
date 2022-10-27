package Scanner;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Scannerex {

	public static void main(String args[]) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("class loaded");

		// create the connection
 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
         System.out.println("connected for database");
		PreparedStatement ps = connection.prepareStatement("insert into emp values(?,?,?)");

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("enter id:");
			int id = (sc.nextInt());
			System.out.println("enter name:");
			String name = sc.next();
			System.out.println("enter salary:");
			int salary = sc.nextInt();

			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setFloat(3, salary);
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			System.out.println("Do you want to continue: yes/no");
			String option = sc.next();
			if (option.equals("no")) {
				break;
			}
		} while (true);

		connection.close();
		ps.close();
		sc.close();
		
		
	}
}