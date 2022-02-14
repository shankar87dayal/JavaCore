package com.javacore.wrapper.class_1;

public class Lab1155 {
	public static void main(String[] args) {
		Long ref1 = new Long(128L);
		Long ref2 = new Long(130L);
		Long ref3 = new Long(126L);
		System.out.println("-- compareTo(Long)--");
		System.out.println(ref1.compareTo(ref1));
		System.out.println(ref1.compareTo(ref2));
		System.out.println(ref1.compareTo(ref3));
		System.out.println("-- compareTo(Long, Long)--");
		System.out.println(Long.compare(ref1, ref1));
		System.out.println(Long.compare(ref1, ref2));
		System.out.println(Long.compare(ref1, ref3));
	}
}
