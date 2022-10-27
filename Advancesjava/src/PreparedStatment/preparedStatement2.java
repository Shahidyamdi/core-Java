package PreparedStatment;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedStatement2 {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
		PreparedStatement preparedstatement = connection.prepareStatement("update  emp set esal=esal+? where esal>? ");
		preparedstatement.setInt(1, 850);
		preparedstatement.setInt(2, 300000);

		int x = preparedstatement.executeUpdate();
		System.out.println("updated salaries for employee " + x);

		connection.close();
		preparedstatement.close();
		System.out.println("all resources are released");
	}
}
