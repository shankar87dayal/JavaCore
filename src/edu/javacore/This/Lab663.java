package edu.javacore.This;

public class Lab663 {
	public static void main(String[] args) {
		System.out.println("main: " + Hello42.a);
	}
}

class Hello42 {
	static int a = 10;
	static Hello42 h = new Hello42();
	{
		System.out.println("IB");
	}
	static {
		System.out.println("SB");
	}
	static Hello42 h2 = new Hello42();
}
