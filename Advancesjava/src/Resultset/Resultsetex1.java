package Resultset;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Resultsetex1 {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet set = statement.executeQuery("select * from emp ");
		set.afterLast();
		while (set.previous()) {
			System.out.println(set.getInt(1)+" "+set.getString(2) + " " + set.getInt(3));
		}

		set.close();
		connection.close();
		statement.close();
		System.out.println("all resources are released");
	}
}
