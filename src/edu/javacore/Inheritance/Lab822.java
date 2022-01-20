package edu.javacore.Inheritance;

public class Lab822 {
	public static void main(String[] args) {
		Hello18.show();
	}
}

class Hai19 {
	static void show() {
		System.out.println("Hai-> show");
	}

	static {
		System.out.println("Hai-> S.B");
	}
}

class Hello18 extends Hai19 {
	static {
		System.out.println("Hello -> S.B");
	}
}