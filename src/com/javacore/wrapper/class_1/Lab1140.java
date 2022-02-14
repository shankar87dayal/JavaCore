package com.javacore.wrapper.class_1;

public class Lab1140 {
	public static void main(String[] args) {
		byte b1 = Byte.parseByte("101", 2);
		System.out.println(b1);
		byte bref = Byte.valueOf("101", 2);
		System.out.println(bref);
		System.out.println(Byte.parseByte("101", 8));
		System.out.println(Byte.valueOf("101", 2));
		System.out.println(Byte.parseByte("101", 10));
		System.out.println(Byte.valueOf("101", 10));
//	System.out.println(Byte.parseByte("101",16));
//	System.out.println(Byte.valueOf("101",16));
	}
}
