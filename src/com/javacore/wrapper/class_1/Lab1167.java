package com.javacore.wrapper.class_1;

public class Lab1167 {
	public static void main(String[] args) {
		Double iref1 = new Double(88.0F);
		Double iref2 = new Double(99.0F);
		Double iref3 = new Double(77.0f);
		System.out.println("-- compareTo(Float)--");
		System.out.println(iref1.compareTo(iref1));
		System.out.println(iref1.compareTo(iref2));
		System.out.println(iref1.compareTo(iref3));
		System.out.println("-- compareTo(Integer, Integer)--");
		System.out.println(Double.compare(iref1, iref1));
		System.out.println(Double.compare(iref1, iref2));
		System.out.println(Double.compare(iref1, iref3));
	}
}


