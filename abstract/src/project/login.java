package project;

public class login extends services{

	@Override
	String login(String username, String password) {
		return " username & password sucessfully done";
	}
	public static void main(String[] args) {
		login l = new  login();
		System.out.println(l.login("shahid", "sameer"));
		
	}

}
