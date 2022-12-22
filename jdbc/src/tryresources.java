import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class tryresources {
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system",
				"shahid"); Statement statement = connection.createStatement();) {

			ResultSet set = statement.executeQuery("select * from emp");
			while (set.next()) {
				System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getInt(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
