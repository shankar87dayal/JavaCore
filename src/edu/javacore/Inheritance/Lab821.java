package edu.javacore.Inheritance;

class Hai18 {
	public static void main(String[] args) {
		System.out.println("Hai-> main");
	}

	static {
		System.out.println("Hai S.B");
	}
}

public class Lab821 extends Hai18 {
	static {
		System.out.println("Lab802 S.B");
	}
}
