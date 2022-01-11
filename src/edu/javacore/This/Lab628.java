package edu.javacore.This;

public class Lab628 {
	public static void main(String[] args) {
		System.out.println("\n main:" + Hello12.a);
	}
}

class Hello12 {
	static {
		String a = "Raushan";
		System.out.println("S.Block: " + a);
		System.out.println(Hello12.a);
	}
}