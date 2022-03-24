package com.javacore.wrapper.class_1;

public class Lab1177 {
	public static void main(String[] args) {
		Boolean bol1 = new Boolean(true);
		Boolean bol2 = new Boolean(false);
		Boolean bol3 = new Boolean("TrUe");
		Boolean bol4 = new Boolean("faLse");
		Boolean bol5 = new Boolean("JLC");
		System.out.println("--hashCode()--");
		System.out.println(bol1.hashCode());
		System.out.println(bol2.hashCode());
		System.out.println(bol3.hashCode());
		System.out.println(bol4.hashCode());
		System.out.println("--equals()--");
		System.out.println(bol1.equals(bol2));
		System.out.println(bol1.equals(bol3));
		System.out.println(bol1.equals(bol4));
		System.out.println(bol2.equals(bol4));
		System.out.println(bol2.equals(bol5));
	}
}
