package com.tcs.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class callable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
	    System.out.println("class loaded success");
	    CallableStatement callablestatement = connection.prepareCall("{call getsal(?,?)}");
	    callablestatement.setInt(1, 111);
	    callablestatement.registerOutParameter(2, Types.DOUBLE);
	    callablestatement.execute();
	    System.out.println("Result>>>>"+callablestatement.getDouble(2));
	    
	    
	    connection.close();
	    callablestatement.close();
	    System.out.println("Resources are released");
	}
	

}
