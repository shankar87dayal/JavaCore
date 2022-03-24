package com.javacore.wrapper.class_1;

public class Lab1168 {
	public static void main(String[] args) {
		Double ref1 = new 		Double(126.0F);
		Double ref2 = new 		Double(130.0);
		Double ref3 = new 		Double(126.0F);
		System.out.println("-- hashcode()--");
		System.out.println(ref1.hashCode());
		System.out.println(ref2.hashCode());
		System.out.println(ref3.hashCode());
		System.out.println("--equals--");
		System.out.println(ref1.equals(ref2));
		System.out.println(ref1.equals(ref3));

	}
}
