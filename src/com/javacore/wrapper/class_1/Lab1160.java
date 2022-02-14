package com.javacore.wrapper.class_1;

public class Lab1160 {
	public static void main(String[] args) {
		System.out.println(Float.isNaN(0.0f / 0.0f));
		System.out.println(Float.isNaN(-0.0f / 0.0f));
		System.out.println(Float.isNaN(9 / 0.0f));
		System.out.println(Float.isFinite(9 / 0.0f));
		Float f1 = new Float(0.0f / 0.0f);
		System.out.println(f1.isInfinite());
		System.out.println(f1.isNaN());
	}
}
