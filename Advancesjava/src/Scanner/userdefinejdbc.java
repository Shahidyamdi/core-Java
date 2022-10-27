package Scanner;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class userdefinejdbc {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
		Statement state = connection.createStatement();

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter a emp id");
			int eid = sc.nextInt();
			System.out.println("Enter a emp name");
			String ename = sc.next();
			System.out.println("Enter a salary");
			double esal = sc.nextDouble();
			state.executeUpdate("insert into emp values(" + eid + " , '" + ename + "' ," + esal + ")");
			System.out.println(" you want another record (yes/no)");
			String option = sc.next();
			if (option.equals("no"))
				break;
		}
		sc.close();
		connection.close();
		state.close();
		System.out.println("all resources are released");
	}

}
