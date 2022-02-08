package com.corejava.stringclass_1;

public class Lab1089 {
	public static void main(String[] args) {
		String str = "JLCINDIA";
		int len = str.length();
		char cArr[] = new char[len];
		for (int i = 0; i < len; i++) {
			cArr[i] = str.charAt(i);
		}
		System.out.println("\n** char array**");
		for (int i = 0; i < cArr.length; i++) {
			char ch = cArr[i];
			System.out.println(i + "\t" + ch);
		}
	}
}
