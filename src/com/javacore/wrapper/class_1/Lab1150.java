package com.javacore.wrapper.class_1;

public class Lab1150 {
	public static void main(String[] args) {
		Integer iref1 = new Integer(128);
		Integer iref2 = new Integer(130);
		Integer iref3 = new Integer(126);
		System.out.println("-- compareTo(Integer)--");
		System.out.println(iref1.compareTo(iref1));
		System.out.println(iref1.compareTo(iref2));
		System.out.println(iref1.compareTo(iref3));
		System.out.println("-- compareTo(Integer, Integer)--");
		System.out.println(Integer.compare(iref1, iref1));
		System.out.println(Integer.compare(iref1, iref2));
		System.out.println(Integer.compare(iref1, iref3));
	}
}
