package com.javacore.wrapper.class_1;

public class Lab1166 {
	public static void main(String[] args) {
		System.out.println(Double.isNaN(0.0 / 0.0));
		System.out.println(Double.isNaN(-0.0 / 0.0));
		System.out.println(Double.isNaN(9 / 0.0));
		System.out.println(Double.isFinite(9 / 0.0));
		Double f1 = new Double(0.0 / 0.0D);
		System.out.println(f1.isInfinite());
		System.out.println(f1.isNaN());
	}
}
