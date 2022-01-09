package edu.javacore.Object;

public class Lab576 {
	public static void main(String[] args) {
		Hello34 h = new Hello34();
		System.out.println("\n Main: " + h.a);
	}
}

class Hello34 {
	final int a;
	{
		a = 99;
	}
}