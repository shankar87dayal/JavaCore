package com.corejava.stringclass_1;

public class Lab1087 {
	public static void main(String[] args) {
		String str = "JLCINDIA";
		int len = str.length();
		System.out.println(str.substring(3, len));
		System.out.println(str.substring(3, len - 1));
		System.out.println(str.substring(3, len - 2));

	}
}
