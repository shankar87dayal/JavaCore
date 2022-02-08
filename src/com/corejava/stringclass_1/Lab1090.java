package com.corejava.stringclass_1;

public class Lab1090 {
	public static void main(String[] args) {
		String str = "JLCINDIA";
		int len = str.length();
		byte bArr[] = new byte[len];
		for (int i = 0; i < len; i++) {
			bArr[i] = (byte) (str.charAt(i));
		}
		System.out.println("\n** byte array**");
		for (int i = 0; i < bArr.length; i++) {
			byte b = bArr[i];
			System.out.println(i + "\t" + b + "\t" + (char) b);
		}
	}
}
