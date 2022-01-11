package edu.javacore.This;

public class Lab629 {
	public static void main(String[] args) {
		System.out.println("\n main:" + Hello13.a);
	}
}

class Hello13 {
	static int a;
	static {
		String a = "Raushan";
		System.out.println("\n S.Block: " + a);
		System.out.println("\n S.Block: " + Hello13.a);
	}
}
