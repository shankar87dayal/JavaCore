package com.javacore.wrapper.class_1;

public class Lab1161 {
	public static void main(String[] args) {
		Float iref1 = new Float(88.0F);
		Float iref2 = new Float(99.0F);
		Float iref3 = new Float(77.0f);
		System.out.println("-- compareTo(Float)--");
		System.out.println(iref1.compareTo(iref1));
		System.out.println(iref1.compareTo(iref2));
		System.out.println(iref1.compareTo(iref3));
		System.out.println("-- compareTo(Integer, Integer)--");
		System.out.println(Float.compare(iref1, iref1));
		System.out.println(Float.compare(iref1, iref2));
		System.out.println(Float.compare(iref1, iref3));
	}
}
