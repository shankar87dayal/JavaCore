package edu.javacore.This;

public class Lab622 {
	public static void main(String[] args) {
		Hello6 h = new Hello6(99);
		h.show();
	}
}

class Hello6 {
	int a;

	Hello6() {
		System.out.println("Hello Dc");
	}

	Hello6(int a) {
		System.out.println("Hello 1-arg con");
		this.a = a;
		this();

	}

	void show() {
		System.out.println(a);
	}
}
