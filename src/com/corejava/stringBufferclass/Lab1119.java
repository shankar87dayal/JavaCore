package com.corejava.stringBufferclass;

public class Lab1119 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("JLCINDIA");
		System.out.println(sb1);
		sb1.setCharAt(2, 'x');
		System.out.println(sb1);
		sb1.replace(4, 7, "Raushan");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
	}
}
