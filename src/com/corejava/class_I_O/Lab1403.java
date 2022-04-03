package com.corejava.class_I_O;

public class Lab1403 {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter 1st character");
		int var = System.in.read();
		System.out.println(var + "\t" + (char) var);
		System.out.println("Enter 2nd character");
		var = System.in.read();
		System.out.println(var + "\t" + (char) var);
		System.out.println("Enter 3rd character");
		var = System.in.read();
		System.out.println(var + "\t" + (char) var);
	}
}
