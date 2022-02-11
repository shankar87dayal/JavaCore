package com.corejava.stringBufferclass;

public class Lab1120 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("JLCINDIA");
		System.out.println(sb1);
		sb1.insert(3, true);
		System.out.println(sb1);
		sb1.deleteCharAt(2);
		System.out.println(sb1);
		sb1.delete(3, 8);
		System.out.println(sb1);
	}
}
