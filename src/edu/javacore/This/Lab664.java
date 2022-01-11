package edu.javacore.This;

public class Lab664 {
	public static void main(String[] args) {
		System.out.println("main: " + Hello43.a);
	}
}

class Hello43 {
	static int a = 10;
	static Hello42 h;
	{
		System.out.println("IB");
	}
	static {
		System.out.println("SB");
	}
	static Hello42 h2;
}
