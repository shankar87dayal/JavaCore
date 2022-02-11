package com.corejava.stringBufferclass;

public class Lab1127 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JLC");
		System.out.println("\nC: " + sb.capacity());
		System.out.println("L: " + sb.length());
		sb.trimToSize();
		System.out.println("\nC: " + sb.capacity());
		System.out.println("L: " + sb.length());
	}
}
