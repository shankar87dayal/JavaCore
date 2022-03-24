package com.javacore.wrapper.class_1;

public class Lab1178 {
	public static void main(String[] args) {
		Boolean bol1 = new Boolean(true);
		Boolean bol2 = new Boolean(false);
		Boolean bol3 = new Boolean("TrUe");
		Boolean bol4 = new Boolean("faLse");
		System.out.println("--compareTo(Boolean)--");
		System.out.println(bol1.compareTo(bol2));
		System.out.println(bol1.compareTo(bol3));
		System.out.println(bol2.compareTo(bol3));
		System.out.println(bol2.compareTo(bol4));
		System.out.println("--compare(Boolean,Boolean)--");
		System.out.println(Boolean.compare(bol1, bol2));
		System.out.println(Boolean.compare(bol1, bol3));
		System.out.println(Boolean.compare(bol2, bol3));
		System.out.println(Boolean.compare(bol2, bol4));
	}
}
