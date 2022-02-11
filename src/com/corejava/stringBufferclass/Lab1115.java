package com.corejava.stringBufferclass;

public class Lab1115 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("JLC");
		System.out.println(sb1);
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
		sb1.append("welcome to jlc,(java learning center.)");
		System.out.println(sb1);
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
	}
}
