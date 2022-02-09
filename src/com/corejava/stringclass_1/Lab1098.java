package com.corejava.stringclass_1;

public class Lab1098 {
	public static void main(String[] args) {
		String str = " jLC, java training center , No1 in java training and placement.java is a popular language.";
		String res[] = str.split("java");
		System.out.println("length: " + res.length);
		for (int i = 0; i < res.length; i++) {
			String st = res[i];
			System.out.println(i + "\t" + st);
		}
	}
}
