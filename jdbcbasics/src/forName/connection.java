package forName;

public class connection {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
	}

}
}