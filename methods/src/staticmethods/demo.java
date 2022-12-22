package staticmethods;

public class demo {
	static void login(String username, String password) {
		if (username == "shahid" && password == "java") {
			System.out.println("login sucess " + username);
		} else {
			System.out.println("login fail!");
		}
	}

	public static void main(String[] args) {
		new demo().login("shahid", "java");

	}

}
