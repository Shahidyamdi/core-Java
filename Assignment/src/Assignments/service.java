package Assignments;

public class service {
	void voteRegister(String name, long mobile, int age, int sscRoll, String location) {
		if (age > 18 && location == "hyderabad") {
			System.out.println(
					" you are eligible for vote :" + name + " " + mobile + " " + age + " " + sscRoll + " " + location);
		} else if (age > 18 && location != "hyderabad") {
			System.out.println(" you are eligible ! but only for hyderabad citizen " + name);

		} else {
			System.out.println("you are not eligible");
		}
	}

}
