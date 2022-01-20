package edu.javacore.Inheritance;

public class Lab814 {
	public static void main(String[] args) {
		new Hello11();
	}
}

class Hai11 {
	static int a =99;
	static {
		System.out.println("Hai-> S.B "+a);
	}
}

class Hello11 extends Hai11 {
	static int b=88;
	static {
		System.out.println("Hello->S.B "+a);
		System.out.println("Hello->S.B "+b);
	}
}
