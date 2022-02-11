package com.corejava.stringBufferclass;

public class Lab1116 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("JLC");
		System.out.println(sb1);
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
		sb1.append("welcome");
		System.out.println(sb1);
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
		sb1.append(123.4567);
		System.out.println(sb1);
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
		sb1.append(true);
		System.out.println(sb1);
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
	}
}
