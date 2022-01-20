package edu.javacore.Inheritance;

public class Lab816 {
	public static void main(String[] args) {
		System.out.println(Hai13.a);
	}
}

class Hai13 {
	static int a = 99;
	static {
		System.out.println("Hai->S.B");
	}
}

class Hello13 extends Hai13 {
	static {
		System.out.println("Hello-> S.B");
	}
}
