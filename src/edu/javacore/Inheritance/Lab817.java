package edu.javacore.Inheritance;

public class Lab817 {
	public static void main(String[] args) {
		System.out.println(Hello14.a);
	}
}

class Hai14 {
	static int a = 99;
	static {
		System.out.println("Hai->S.B");
	}
}

class Hello14 extends Hai14 {
	static {
		System.out.println("Hello-> S.B");
	}
}
