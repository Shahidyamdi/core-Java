package com.basics;

public class DSAdemo {
	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'c', 'x' };
        char[] arr2 = { 'z', 'y', 'i' };
        ContainCommon(arr1, arr2);
	}
	
	public static boolean ContainCommon(char[] arrOne, char[] arrTwo) {

		for (int i = 0; i < arrOne.length; i++) {
			for (int j = 0; j < arrTwo.length; j++) {
				if (arrOne[i] == arrTwo[j]) {
					return true;
				}
			}
		}
		return false;
}
}