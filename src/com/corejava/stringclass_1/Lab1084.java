package com.corejava.stringclass_1;

public class Lab1084 {
	public static void main(String[] args) {
		String str = "welcome to jlc, java training center , No1 in java training and replace";
		System.out.println(str);
		System.out.println(str.lastIndexOf("java"));
		System.out.println(str.lastIndexOf("java", 46));
		System.out.println(str.indexOf("java", 45));
	}
}
