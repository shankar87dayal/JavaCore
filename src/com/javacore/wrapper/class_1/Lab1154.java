package com.javacore.wrapper.class_1;

public class Lab1154 {
	public static void main(String[] args) {
		Long x = Long.parseLong("101", 2);
		System.out.println(x);
		Long iref = Long.valueOf("101", 2);
		System.out.println(iref);
		System.out.println(Long.parseLong("101", 8));
		System.out.println(Long.valueOf("101", 8));
		System.out.println(Long.parseLong("101", 10));
		System.out.println(Long.valueOf("101", 16));
//		System.out.println(Long.parseLong("983AC", 8));
		System.out.println(Long.valueOf("983TC", 16));
	}
}
