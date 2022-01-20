package edu.javacore.Inheritance;

public class Lab813 {
	public static void main(String[] args) {
		new Hello10();
	}
}

class Hai10 {
	static {
		System.out.println("Hai-> S.B");
	}
}

class Hello10 extends Hai10 {
	static {
		System.out.println("Hello->S.B");
	}
}