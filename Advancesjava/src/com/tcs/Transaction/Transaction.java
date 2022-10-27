package com.tcs.Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		     connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
			statement = connection.createStatement();
			connection.setAutoCommit(false);
			//statement.executeUpdate("insert into emp values(111,'shahid',10000)");
			statement.executeUpdate("insert into emp values(222,'sameer',20000)");
			statement.executeUpdate("insert into emp values(333,'samuel',30000)");
			statement.executeUpdate("update emp set esal = esal+500 where esal>9000");
			statement.executeUpdate("delete from  emp where eid =333");
			connection.commit();
			System.out.println(" transaction sucessfully");
		}catch (Exception e) {
			connection.rollback();
			System.out.println("transaction fail");
		}finally {
			if(connection!=null)connection.close();
			if(statement!=null)statement.close();
		}
		System.out.println("All Resources completed");
	}

}
