package com.corejava.stringclass_1;

public class Lab1060 {
	public static void main(String[] args) {
		String st1 = "JLC";
		String st2 = "INDIA";
		String st3 = st1.concat(st2);
		System.out.println(st3);
		String st4 = "JLCINDIA";
		System.out.println(st3 == st4);
	}
}
