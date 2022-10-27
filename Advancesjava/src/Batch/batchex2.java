package Batch;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class batchex2 {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
	PreparedStatement preparedstatement = connection.prepareStatement("update emp1 set ename = ? where eid=?");
	preparedstatement.setString(1, "akbar");
	preparedstatement.setInt(2, 111);
	preparedstatement.executeBatch();
	
	preparedstatement.setString(1, "munny");
	preparedstatement.setInt(2, 222);
	preparedstatement.executeBatch();
	
	preparedstatement.setString(1, "sameer");
	preparedstatement.setInt(2, 111);
	preparedstatement.executeBatch();
		connection.close();
		preparedstatement.close();
		System.out.println("resources released");

	}
	

}
