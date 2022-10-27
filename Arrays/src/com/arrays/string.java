package com.arrays;

public class string {
	public static void main(String[] args) {
		String s[] = new String[10];
		s[0] = "sammer";
		s[5] = "shahid";
		s[7] = "munny";
		s[8] = "akbar";
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				System.out.println(i);
			}
		}
	}

}
