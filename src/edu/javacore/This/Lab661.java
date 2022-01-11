package edu.javacore.This;

public class Lab661 {
	public static void main(String[] args) {
		System.out.println("main: " + Hello40.a);
	}
}

class Hello40 {
	static int a = 10;
	{
		System.out.println("IB");
	}
	static {
		System.out.println("SB");
	}
	static Hello40 h = new Hello40();
}