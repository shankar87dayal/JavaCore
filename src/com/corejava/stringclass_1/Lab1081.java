package com.corejava.stringclass_1;

public class Lab1081 {
	public static void main(String[] args) {
		String str = "welcome to jlc, java training center, No1 in java training and replace";
		System.out.println(str.indexOf('j'));
		System.out.println(str.indexOf('j', 11));
		System.out.println(str.indexOf('j', 12));
		
		System.out.println(str.indexOf('j', 17));
	}
}
