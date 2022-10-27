package com.tcs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class jdbc1 {
	public static void main(String[] args) throws SQLException {
		Connection connection = Testconn.createConnection(); 
		DatabaseMetaData metaData = connection.getMetaData();
		System.out.println(metaData.getURL());
		System.out.println(metaData.getDatabaseProductName());
		System.out.println(metaData.getDatabaseProductVersion());
	}

}
