package edu.javacore.Inheritance;

public class Lab815 {
	public static void main(String[] args) {
		System.out.println(Hello12.a);
	}
}

class Hai12 {
	static {
		System.out.println("Hai->S.B");
	}
}

class Hello12 extends Hai12 {
	static int a = 99;
	static {
		System.out.println("Hello-> S.B");
	}
}