package com.corejava.stringBufferclass;

public class Lab1113 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder(-3);
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
	}
}
