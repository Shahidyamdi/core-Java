package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class student {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","shahid2812");
			PreparedStatement preparedstatement = connection.prepareStatement("insert into student values (?,?,?)");
			Scanner sc = new Scanner(System.in);
			while (true) {

				System.out.println("Enter a rollno ");
				int roll = sc.nextInt();
				System.out.println("Enter a name");
				String name = sc.next();
				System.out.println("Enter a marks");
				int marks = sc.nextInt();
				preparedstatement.setInt(1, roll);
				preparedstatement.setString(2, name);
				preparedstatement.setDouble(3, marks);
				preparedstatement.executeUpdate();
				System.out.println(" you want another record (yes/no)");
				String option = sc.next();
				if (option.equals("no"))
					break;
			}
			sc.close();
			connection.close();
			preparedstatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
