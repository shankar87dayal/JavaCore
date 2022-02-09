package com.corejava.stringclass_1;

public class Lab1093 {
	public static void main(String[] args) {
		String str = "JLCINDIA";
		char cArr[] = new char[10];
		byte bArr[] = new byte[10];
		cArr[0] = 'S';
		cArr[0] = 'R';
		cArr[0] = 'I';
		str.getChars(3, 7, cArr, 4);
		str.getChars(3, 7, cArr, 4);
		System.out.println("\n** char Array**");
		for (int i = 0; i < cArr.length; i++) {
			char ch = cArr[i];
			System.out.println(i + "\t" + ch);
		}
		System.out.println("\n** byte Array **");
		for (int i = 0; i < bArr.length; i++) {
			byte b = bArr[i];
			System.out.println(i + "\t" + b + "\t" + (char) b);
		}
	}
}
