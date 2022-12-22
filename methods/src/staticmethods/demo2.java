package staticmethods;

public class demo2 {
	static void courseinfo(String name, String course) {
		if (course.equals("corejava")) {
			System.out.println(" hi : " + name + " :corejava faculty is Ratna");
		} else if (course.equals("python")) {
			System.out.println("hi :" + name + " :python faculty is shahid");
		} else {
			System.out.println(" course is not available");
		}

	}

	public static void main(String[] args) {
		new demo2().courseinfo("shahid", "corejava");
	}

}
