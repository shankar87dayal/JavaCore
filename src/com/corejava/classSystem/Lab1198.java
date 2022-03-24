package com.corejava.classSystem;

public class Lab1198 {
	public static void main(String[] args) throws Exception {
		Object ref1 = new int[] { 23, 45, 29, 16, 5, 12 };
		Object ref2 = new int[] { 101, 102, 29, 125, 98 };
		int obj[] = new int[10];
		System.arraycopy(ref1, 0, obj, 0, 6);
		System.out.println("First Array Data");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(i + "\t" + obj[i]);
		}
		System.out.println("Second Array Data");
		System.arraycopy(ref2, 1, obj, 6, 3);
		for (int i = 0; i < obj.length; i++) {
			System.out.println(i + "\t" + obj[i]);
		}
	}
}
