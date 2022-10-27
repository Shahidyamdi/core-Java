import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedStatement {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
		PreparedStatement preparedstatement = connection.prepareStatement("insert into emp values (?,?,?)");
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter a emp id");
			int eid = sc.nextInt();
			System.out.println("Enter a emp name");
			String ename = sc.next();
			System.out.println("Enter a salary");
			double esal = sc.nextDouble();
			preparedstatement.setInt(1, eid);
			preparedstatement.setString(2, ename);
			preparedstatement.setDouble(3, esal);
			preparedstatement.executeUpdate();
			System.out.println(" you want another record (yes/no)");
			String option = sc.next();
			if (option.equals("no"))
				break;
		}
		sc.close();
		connection.close();
		preparedstatement.close();
		System.out.println("all resources are released"); 
	}

}
