package Resultset;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Resultsetex2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
		System.out.println("loaded");
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet set = statement.executeQuery("select * from emp ");
		set.afterLast();
		while (set.previous()) {
			System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getInt(3));
		}
		set.first();
		System.out.println(set.getInt(1));
		set.absolute(3);
		System.out.println(set.getInt(3));

		set.close();
		connection.close();
		statement.close();
		System.out.println("all resources are released");
	}
}
