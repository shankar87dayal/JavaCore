package com.corejava.stringclass_1;

public class Lab1088 {
	public static void main(String[] args) {
		String str = "JLCINDIA";
		int len = str.length();
		System.out.println(str);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		for (int i = 0; i < len; i++) {
			System.out.println(i + "\t" + str.charAt(i));
		}
	}
}
