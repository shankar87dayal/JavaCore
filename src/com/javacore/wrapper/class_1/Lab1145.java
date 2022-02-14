package com.javacore.wrapper.class_1;

public class Lab1145 {
	public static void main(String[] args) {
		short s1 = 128;
		short s2 = 130;
		short s3 = 126;
		Short sref1 = new Short(s1);
		Short sref2 = new Short(s2);
		Short sref3 = new Short(s3);
		System.out.println("-- compareTo(short)--");
		System.out.println(sref1.compareTo(sref1));
		System.out.println(sref1.compareTo(sref2));
		System.out.println(sref1.compareTo(sref3));
		System.out.println("-- compareTo(short, short)--");
		System.out.println(Short.compare(sref1, sref1));
		System.out.println(Short.compare(sref1, sref2));
		System.out.println(Short.compare(sref1, sref3));
	}
}
