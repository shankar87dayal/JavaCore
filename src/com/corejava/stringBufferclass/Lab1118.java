package com.corejava.stringBufferclass;

public class Lab1118 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("JLCINDIA");
		System.out.println(sb1);
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
		sb1.setLength(15);
		System.out.println(sb1);
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
	}
}
