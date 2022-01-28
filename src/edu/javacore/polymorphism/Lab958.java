package edu.javacore.polymorphism;

abstract class Hello2 {
	abstract void show();
}

class Hai1 extends Hello2 {
	void show() {
		System.out.println("Hai1-> show()");
		super.show();
	}
}

public class Lab958 {
	public static void main(String[] args) {
		Hai1 hai = new Hai1();
		hai.show();
	}
}
