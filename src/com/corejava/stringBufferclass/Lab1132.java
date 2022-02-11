package com.corejava.stringBufferclass;

public class Lab1132 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("A");
		StringBuilder sb2 = new StringBuilder("A");
		String st1 = sb1.toString();
		String st2 = sb2.toString();
		System.out.println(sb1.equals(sb2));
	}
}
