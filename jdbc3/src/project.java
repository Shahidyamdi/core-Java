import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class project {
	public static void main(String[] args) {
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system",
				"shahid");
		Statement statement = connection.createStatement();
//			statement.executeUpdate("insert into student values(12041,'shahid',35)");
//			statement.executeUpdate("insert into student values(12041,'samuel',35)");
//			statement.executeUpdate("insert into student values(12041,'ammi',35)");
//			System.out.println("done!");
//			
//			statement.executeQuery("update student set smarks=smarks +5 where smarks>40");
//			System.out.println("updates");
					ResultSet set = statement.executeQuery("select * from student");
					while(set.next()) {
						System.out.println(set.getInt(1)+ " "+set.getString(2)+" "+set.getInt(3));
					}
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
	}

}
