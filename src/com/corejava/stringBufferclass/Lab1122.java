package com.corejava.stringBufferclass;

public class Lab1122 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("JLCINDIA");
		System.out.println("\nC: " + sb1.capacity());
		System.out.println("L: " + sb1.length());
		sb1.ensureCapacity(-2);
		System.out.println("\nC: " + sb1.capacity());
		System.out.println("L: " + sb1.length());
	}
}
