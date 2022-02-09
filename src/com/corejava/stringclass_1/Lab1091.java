package com.corejava.stringclass_1;

public class Lab1091 {
	public static void main(String[] args) {
		String str = "JLCINDIA";
		char cArr[] = str.toCharArray();
		System.out.println("\n** char Array**");
		for (int i = 0; i < cArr.length; i++) {
			char ch = cArr[i];
			System.out.println(i + "\t" + ch);
		}

	}
}
