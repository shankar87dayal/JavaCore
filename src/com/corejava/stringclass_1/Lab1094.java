package com.corejava.stringclass_1;

public class Lab1094 {
	public static void main(String[] args) {
		char cArr[] = { 'J', 'L', 'C', 'I', 'N', 'D', 'I', 'A' };
		String st = "";
		for (int i = 0; i < cArr.length; i++) {
			char c = cArr[i];
			st += c;
		}
		System.out.println("from char Array: " + st);
	}
}
