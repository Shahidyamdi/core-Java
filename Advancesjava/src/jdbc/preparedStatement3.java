package jdbc;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preparedStatement3 {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
		PreparedStatement preparedstatement = connection.prepareStatement("select ename,esal from emp  where esal>? ");
		preparedstatement.setInt(1, 1000000);
		ResultSet set = preparedstatement.executeQuery();
		while(set.next()) {
			System.out.println(set.getString(1)+" "+set.getInt(2));
		}
		


		connection.close();
		preparedstatement.close();
		System.out.println("all resources are released");
	}
}
