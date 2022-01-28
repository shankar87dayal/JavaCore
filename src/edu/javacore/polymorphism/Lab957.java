package edu.javacore.polymorphism;

abstract class Hello1 {
	int a;

	Hello1(int a) {
		this.a = a;
		System.out.println("Hello1(int)cons");
	}

	{
		System.out.println("Hello1->I.B");
	}

	void show() {
		System.out.println("Hello->show()");
	}
}

class Hai extends Hello1 {
	Hai(int a) {
		super(a);
	}
}

public class Lab957 {
	public static void main(String[] args) {
		Hai hai = new Hai(10);
		hai.show();
	}
}
