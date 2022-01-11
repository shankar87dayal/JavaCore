package edu.javacore.This;

public class Lab662 {
	public static void main(String[] args) {
		System.out.println("main: " + Hello41.a);
	}
}

class Hello41 {
	static int a = 10;
	static Hello41 h = new Hello41();
	{
		System.out.println("IB");
	}
	static {
		System.out.println("SB");
	}
}
