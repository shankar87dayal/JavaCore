package com.javacore.wrapper.class_1;

public class Lab1156 {
	public static void main(String[] args) {
		Long ref1 = new 		Long(126L);
		Long ref2 = new 		Long(130L);
		Long ref3 = new 		Long(126L);
		System.out.println("-- hashcode()--");
		System.out.println(ref1.hashCode());
		System.out.println(ref2.hashCode());
		System.out.println(ref3.hashCode());
		System.out.println("--equals--");
		System.out.println(ref1.equals(ref2));
		System.out.println(ref1.equals(ref3));

	}
}
