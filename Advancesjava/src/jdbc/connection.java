package jdbc;
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
	public static void main(String[] args)  {
		// load the driver
		Connection connection = null;
		Statement statement = null;
		String sql = null;
		Statement state = null;
try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("class loaded");

		// create the connection
 connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
         System.out.println("connected for database");
          state = connection.createStatement();
         state.executeUpdate("insert into emp values(111,'shahid',200000)");
         state.executeUpdate("insert into emp values(222,'sameer',300000)");
         state.executeUpdate("insert into emp values(333,'munny',400000)");
         
         System.out.println("successfully inserted ! done");
	
	}catch(SQLException |ClassNotFoundException e) {
		e.printStackTrace();
	
		
	}finally {
		try {
		 if(connection!=null) connection.close();
		 if(statement!=null)statement.close();
		 if(state!=null)state.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}	
	}
	
}