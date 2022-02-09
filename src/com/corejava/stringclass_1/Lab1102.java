package com.corejava.stringclass_1;

public class Lab1102 {
	public static void main(String[] args) {
		String str = " jLC, java training center. No1 in java training and placement.java is a popular language.";
		System.out.println(str);
		String dir = "D:\\B01\\abc\\java\\abc.txt";
		String res[] = dir.split("\\");
		System.out.println("length: " + res.length);
		for (int i = 0; i < res.length; i++) {
			String st = res[i];
			System.out.println(i + "\t" + st);
		}
	}
}
