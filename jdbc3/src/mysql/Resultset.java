package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultset {
	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root",
				"shahid2812");
				Statement statement = connection.createStatement();) {

			ResultSet set = statement.executeQuery("select * from student");
			while (set.next()) {
				System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getInt(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		

	}

}
