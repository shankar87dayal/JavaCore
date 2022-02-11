package com.corejava.stringBufferclass;

public class Lab1121 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("JLCINDIA");
		System.out.println("\nC: " + sb1.capacity());
		System.out.println("L: " + sb1.length());
		sb1.ensureCapacity(12);
		System.out.println("\nC: " + sb1.capacity());
		System.out.println("L: " + sb1.length());
		sb1.ensureCapacity(59);
		System.out.println("\nC: " + sb1.capacity());
		System.out.println("L: " + sb1.length());
	}

}
