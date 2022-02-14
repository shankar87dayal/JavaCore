package com.javacore.wrapper.class_1;

public class Lab1151 {
	public static void main(String[] args) {
		Integer iref1 = new Integer(126);
		Integer iref2 = new Integer(130);
		Integer iref3 = new Integer(126);
		System.out.println("-- hashcode()--");
		System.out.println(iref1.hashCode());
		System.out.println(iref2.hashCode());
		System.out.println(iref3.hashCode());
		System.out.println("--equals--");
		System.out.println(iref1.equals(iref2));
		System.out.println(iref1.equals(iref3));

	}
}
