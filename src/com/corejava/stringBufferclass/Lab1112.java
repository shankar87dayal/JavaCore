package com.corejava.stringBufferclass;

public class Lab1112 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println("C:" + sb1.capacity());
		System.out.println("L: " + sb1.length());
		System.out.println();
		StringBuilder sb2 = new StringBuilder("JLC");
		System.out.println("C:" + sb2.capacity());
		System.out.println("L: " + sb2.length());
		System.out.println();
		StringBuilder sb3 = new StringBuilder(25);
		System.out.println("C:" + sb3.capacity());
		System.out.println("L: " + sb3.length());
	}
}
