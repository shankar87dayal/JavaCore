package com.javacore.wrapper.class_1;

public class Lab1149 {
	public static void main(String[] args) {
		int i = Integer.parseInt("101", 2);
		System.out.println(i);
		Integer iref = Integer.valueOf("101", 2);
		System.out.println(iref);
		System.out.println(Integer.parseInt("101", 8));
		System.out.println(Integer.valueOf("101", 8));
		System.out.println(Integer.parseInt("101", 10));
		System.out.println(Integer.valueOf("101", 16));
//		System.out.println(Integer.parseInt("983AC", 8));
		System.out.println(Integer.valueOf("983AC", 16));
	}
}
