package com.javacore.wrapper.class_1;

public class Lab1162 {
	public static void main(String[] args) {
		Float ref1 = new 		Float(126.0F);
		Float ref2 = new 		Float(130.0);
		Float ref3 = new 		Float(126.0F);
		System.out.println("-- hashcode()--");
		System.out.println(ref1.hashCode());
		System.out.println(ref2.hashCode());
		System.out.println(ref3.hashCode());
		System.out.println("--equals--");
		System.out.println(ref1.equals(ref2));
		System.out.println(ref1.equals(ref3));

	}
}
