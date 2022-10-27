package Batch;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class batchex {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "shahid");
		Statement statement = connection.createStatement();
		statement.addBatch("create table emp1 (eid number,ename varchar2(30),esal number)");
		statement.addBatch("insert into emp1 values(111,'shahid',10000)");
		statement.addBatch("insert into emp1 values(222,'sameer',20000)");
		statement.addBatch("insert into emp1 values(111,'samuel',30000)");
		statement.addBatch("update emp1 set esal=esal+500 where esal>15000");
		statement.addBatch("drop table emp1");
		int[] batch = statement.executeBatch();
		for (int x : batch) {
			System.out.println(x);
		}
		connection.close();
		statement.close();

	}
	

}
