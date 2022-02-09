package com.corejava.stringclass_1;

public class Lab1111 {
	public static void main(String[] args) {
		String str = " jLC, java training center. No1 in java training and placement.java is a popular language.";
		System.out.println(str);
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			int index = str.indexOf("java");
			if (index >= 0) {
				i = index;
				count++;
			}
		}
		System.out.println("cunt: " + count);
	}
}
