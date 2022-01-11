package edu.javacore.This;

public class Lab657 {
	public static void main(String[] args) {
		Hello36 h = new Hello36();
		System.out.println("main: " + h.a);
	}
}

class Hello36 {
	int a = 10;
	static {
		String a = "Ravi";
		System.out.println("SB: " + a + "\t" + a);
	}
}
