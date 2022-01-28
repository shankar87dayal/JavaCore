package edu.javacore.polymorphism;

abstract class Hello {
	static int a = 1234;

	static void show() {
		System.out.println("Hello->show()");
	}
}

public class Lab956 {
	public static void main(String[] args) {
		System.out.println(Hello.a);
		Hello.show();
	}
}
