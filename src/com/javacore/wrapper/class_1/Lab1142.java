package com.javacore.wrapper.class_1;

public class Lab1142 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 15;
		byte b3 = 10;
		Byte bref1 = new Byte(b1);
		Byte bref2 = new Byte(b2);
		Byte bref3 = new Byte(b3);
		System.out.println("-- hashCode()--");
		System.out.println(bref1.hashCode());
		System.out.println(bref2.hashCode());
		System.out.println(bref3.hashCode());
		System.out.println("--equals()--");
		System.out.println(bref1.equals(bref2));
		System.out.println(bref1.equals(bref3));

	}
}
