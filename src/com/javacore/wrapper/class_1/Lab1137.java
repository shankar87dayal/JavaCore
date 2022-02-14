package com.javacore.wrapper.class_1;

public class Lab1137 {
	public static void main(String[] args) {
		String st = "12345";
		Integer in = new Integer(st);
		System.out.println(in);
		String s2 = "123";
		Byte by = new Byte(s2);
		System.out.println(by);
		Boolean b1 = new Boolean("TrUe");
		System.out.println(b1);
		Boolean b2 = new Boolean("JLc");
		System.out.println(b2);
		Integer in2 = new Integer("12.0"); // NFE
		String st1 = "A";
		Character ch = new Character(st1.charAt(0));
	}
}
