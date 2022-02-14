package com.javacore.wrapper.class_1;

public class Lab1141 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 15;
		byte b3 = 5;
		Byte bref1 = new Byte(b1);
		Byte bref2 = new Byte(b2);
		Byte bref3 = new Byte(b3);
		System.out.println("-- compareTo(Byte)--");
		System.out.println(bref1.compareTo(bref1));
		System.out.println(bref1.compareTo(bref2));
		System.out.println(bref1.compareTo(bref3));
		System.out.println("-- compareTo(Byte, Byte)--");
		System.out.println(Byte.compare(bref1, bref1));
		System.out.println(Byte.compare(bref1, bref2));
		System.out.println(Byte.compare(bref1, bref3));

	}
}
