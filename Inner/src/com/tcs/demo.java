package com.tcs;

class outer{
	void show() {
		System.out.println("show method outer");
	}
	class inner{
		void display() {
			System.out.println("display method inner");
		}
	}
}

public class demo {
	public static void main(String[] args) {
		outer o = new outer();
		outer.inner i = o.new inner();
		i.display();
		}

}
