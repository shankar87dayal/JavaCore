package edu.javacore.Inheritance;

public class Lab819 {
	public static void main(String[] args) {
		new Hello16();
	}
}

class Hai16 {
	int a = 99;
	{
		System.out.println("Hai->I.B: " + a);
	}
}

class Hello16 extends Hai16 {
	int b = 88;
	{
		System.out.println("Hello-> I.B: " + a);
		System.out.println("Hello-> I.B: " + b);
	}
}
