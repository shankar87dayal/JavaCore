package com.corejava.stringclass_1;

public class Lab1095 {
	public static void main(String[] args) {
		byte bArr[] = { 65, 66, 67, 68, 69, 98, 97, 50 };
		String st = "";
		for (int i = 0; i < bArr.length; i++) {
			byte b = bArr[i];
			st += b;
		}
		System.out.println("from byte Array: " + st);
		String st1 = "";
		for (int i = 0; i < bArr.length; i++) {
			byte b = bArr[i];
			st1 += (char) b;
		}
		System.out.println("from byte Array: " + st1);
	}
}
