package com.javacore.wrapper.class_1;

public class Lab1136 {
	public static void main(String[] args) {
		Character cref = new Character('A');
		char ch = cref.charValue();
		System.out.println(ch);
		
		Boolean b1 = new Boolean(false);
		boolean bol = b1.booleanValue();
		System.out.println(bol);
		
		Float f1 = new Float(300.3434);
		byte by1 = f1.byteValue();
		short sh = f1.shortValue();
		int in = f1.intValue();
		long var = f1.longValue();
		float fval = f1.floatValue();
		double d1 = f1.doubleValue();

	}
}
